class bad_class{
    public void bad() throws Throwable
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
    
            switch (7)
            {
            case 7:
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                    long result = (long)(data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};