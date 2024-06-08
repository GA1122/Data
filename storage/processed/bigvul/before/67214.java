class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5;
    
            /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
    
            data = 10;
    
            IO.writeLine("" + data);
    
        }
};