class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int [] data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: hardcode data to non-null */
                data = new int[5];
            }
            else
            {
    
                /* FIX: hardcode data to non-null */
                data = new int[5];
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length);
            }
            else
            {
    
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length);
    
            }
        }
};