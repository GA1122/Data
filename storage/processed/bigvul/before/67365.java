class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = 5L;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = 10L;
                IO.writeLine("" + data);
                break;
            }
        }
};