class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Initialize and use data before it is overwritten */
                data = new StringBuilder("Good");
                IO.writeLine(data.toString());
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
    
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
    
                data = new StringBuilder("Reinitialize");
    
                IO.writeLine(data.toString());
    
            }
        }
};