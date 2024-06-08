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
                /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
                data--;
                byte result = (byte)(data);
                IO.writeLine("result: " + result);
                break;
            }
        }
};