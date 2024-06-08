class bad_class{
    public void bad() throws Throwable
        {
            short dataCopy;
            {
                short data;
    
                /* POTENTIAL FLAW: Use a random value */
                data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
                dataCopy = data;
            }
            {
                short data = dataCopy;
    
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Short.MIN_VALUE, this will underflow */
                    short result = (short)(data * 2);
                    IO.writeLine("result: " + result);
                }
    
            }
        }
};