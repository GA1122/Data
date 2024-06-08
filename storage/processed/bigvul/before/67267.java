class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Initialize, but do not use data */
                data = 5;
            }
            else
            {
    
                /* FIX: Initialize and use data before it is overwritten */
    
                data = 5;
    
                IO.writeLine("" + data);
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Possibly over-write the initial value of data before using it */
                data = 10;
                IO.writeLine("" + data);
            }
            else
            {
    
                /* FIX: Use data without over-writing its value */
    
                IO.writeLine("" + data);
    
            }
        }
};