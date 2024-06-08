class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            Integer data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: data is null */
                data = null;
            }
            else
            {
    
                /* POTENTIAL FLAW: data is null */
                data = null;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
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