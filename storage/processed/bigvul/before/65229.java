class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            int [] data;
            if (privateTrue)
            {
                /* FIX: hardcode data to non-null */
                data = new int[5];
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (privateTrue)
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length);
            }
        }
};