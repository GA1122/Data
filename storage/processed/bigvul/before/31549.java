class bad_class{
    public void bad() throws Throwable
        {
            byte dataCopy;
            {
                byte data;
    
                /* POTENTIAL FLAW: Use a random value */
                data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
                dataCopy = data;
            }
            {
                byte data = dataCopy;
    
                /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
                data--;
                byte result = (byte)(data);
    
                IO.writeLine("result: " + result);
    
            }
        }
};