class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = "Good";
            }
            else
            {
    
                /* POTENTIAL FLAW: Initialize, but do not use data */
    
                data = "Good";
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use data without over-writing its value */
                IO.writeLine(data);
            }
            else
            {
    
                /* FIX: Use data without over-writing its value */
    
                IO.writeLine(data);
    
            }
        }
};