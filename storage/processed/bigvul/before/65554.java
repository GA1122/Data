class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (privateFive==5)
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
    
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length());
            }
        }
};