class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = new StringBuilder("Good");
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = new StringBuilder("Reinitialize");
                IO.writeLine(data.toString());
                break;
            }
        }
};