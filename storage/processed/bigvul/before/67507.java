class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = "Good";
            }
            else
            {
    
                /* FIX: Initialize and use data before it is overwritten */
    
                data = "Good";
    
                IO.writeLine(data);
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = "Reinitialize";
                IO.writeLine(data);
            }
            else
            {
    
                /* FIX: Use data without over-writing its value */
    
                IO.writeLine(data);
    
            }
        }
};