class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long dataCopy;
            {
                long data;
    
                /* POTENTIAL FLAW: Use a random value */
                data = (new java.security.SecureRandom()).nextLong();
    
                dataCopy = data;
            }
            {
                long data = dataCopy;
    
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Long.MIN_VALUE)
                {
                    data--;
                    long result = (long)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
    
            }
        }
};