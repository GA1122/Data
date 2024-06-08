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
    
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Byte.MIN_VALUE, this will underflow */
                    byte result = (byte)(data * 2);
                    IO.writeLine("result: " + result);
                }
    
            }
        }
};