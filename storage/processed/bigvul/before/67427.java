class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = new StringBuilder("Good");
            }
            else
            {
    
                /* FIX: Initialize and use data before it is overwritten */
    
                data = new StringBuilder("Good");
    
                IO.writeLine(data.toString());
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = new StringBuilder("Reinitialize");
                IO.writeLine(data.toString());
            }
            else
            {
    
                /* FIX: Use data without over-writing its value */
    
                IO.writeLine(data.toString());
    
            }
        }
};