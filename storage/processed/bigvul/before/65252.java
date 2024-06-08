class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int [] data;
            if (IO.staticTrue)
            {
                /* POTENTIAL FLAW: data is null */
                data = null;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.staticTrue)
            {
                /* FIX: validate that data is non-null */
                if (data != null)
                {
                    IO.writeLine("" + data.length);
                }
                else
                {
                    IO.writeLine("data is null");
                }
            }
        }
};