class bad_class{
    public void bad() throws Throwable
        {
            Integer data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: data is null */
                data = null;
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
    
                /* FIX: validate that data is non-null */
                if (data != null)
                {
                    IO.writeLine("" + data.toString());
                }
                else
                {
                    IO.writeLine("data is null");
                }
    
            }
        }
};