class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data;
            if (IO.staticReturnsTrue())
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MAX_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (IO.staticReturnsTrue())
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < Integer.MAX_VALUE)
                {
                    int result = (int)(++data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to increment.");
                }
            }
        }
};