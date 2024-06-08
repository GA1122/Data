class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long dataCopy;
            {
                long data;
    
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MAX_VALUE;
    
                dataCopy = data;
            }
            {
                long data = dataCopy;
    
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < Long.MAX_VALUE)
                {
                    data++;
                    long result = (long)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to increment.");
                }
    
            }
        }
};