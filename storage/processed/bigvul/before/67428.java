class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            StringBuilder data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = new StringBuilder("Good");
            }
            else
            {
    
                /* POTENTIAL FLAW: Initialize, but do not use data */
    
                data = new StringBuilder("Good");
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use data without over-writing its value */
                IO.writeLine(data.toString());
            }
            else
            {
    
                /* FIX: Use data without over-writing its value */
    
                IO.writeLine(data.toString());
    
            }
        }
};