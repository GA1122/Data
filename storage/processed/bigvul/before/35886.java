class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (IO.staticReturnsTrue())
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MIN_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if(IO.staticReturnsTrue())
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};