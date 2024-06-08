class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: hardcode data to non-null */
                data = "This is not null";
            }
            else
            {
    
                /* FIX: hardcode data to non-null */
                data = "This is not null";
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length());
            }
            else
            {
    
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length());
    
            }
        }
};