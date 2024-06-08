class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = "Good";
    
            /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
    
            data = "Reinitialize";
    
            IO.writeLine(data);
    
        }
};