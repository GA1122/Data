class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            long data;
    
            switch (6)
            {
            case 6:
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Long.MAX_VALUE;
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0L;
                break;
            }
    
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* FIX: Add a check to prevent an overflow from occurring */
                    if (data < (Long.MAX_VALUE/2))
                    {
                        long result = (long)(data * 2);
                        IO.writeLine("result: " + result);
                    }
                    else
                    {
                        IO.writeLine("data value is too large to perform multiplication.");
                    }
                }
                break;
            }
        }
};