class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data + 1);
                IO.writeLine("result: " + result);
                break;
            }
        }
};