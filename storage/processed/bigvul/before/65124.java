class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            Integer data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: hardcode data to non-null */
                data = Integer.valueOf(5);
            }
            else
            {
    
                /* FIX: hardcode data to non-null */
                data = Integer.valueOf(5);
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.toString());
            }
            else
            {
    
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.toString());
    
            }
        }
};