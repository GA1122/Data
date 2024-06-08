class bad_class{
    public void bad() throws Throwable
        {
            int [] data;
            if (privateTrue)
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
    
            if (privateTrue)
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length);
            }
        }
};