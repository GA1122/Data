class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
                count = Integer.MAX_VALUE;
            }
            else
            {
    
                /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
                count = Integer.MAX_VALUE;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                int i = 0;
                /* FIX: Validate count before using it as the for loop variant */
                if (count > 0 && count <= 20)
                {
                    for (i = 0; i < count; i++)
                    {
                        IO.writeLine("Hello");
                    }
                }
            }
            else
            {
    
                int i = 0;
    
                /* FIX: Validate count before using it as the for loop variant */
                if (count > 0 && count <= 20)
                {
                    for (i = 0; i < count; i++)
                    {
                        IO.writeLine("Hello");
                    }
                }
    
            }
        }
};