class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MAX_VALUE;
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* FIX: Add a check to prevent an overflow from occurring */
                    if (data < (Integer.MAX_VALUE/2))
                    {
                        int result = (int)(data * 2);
                        IO.writeLine("result: " + result);
                    }
                    else
                    {
                        IO.writeLine("data value is too large to perform multiplication.");
                    }
                }
    
            }
        }
};