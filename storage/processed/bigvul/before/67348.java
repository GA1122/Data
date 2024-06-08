class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = 5L;
            }
            else
            {
    
                /* POTENTIAL FLAW: Initialize, but do not use data */
    
                data = 5L;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use data without over-writing its value */
                IO.writeLine("" + data);
            }
            else
            {
    
                /* FIX: Use data without over-writing its value */
    
                IO.writeLine("" + data);
    
            }
        }
};