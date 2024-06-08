class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            while (true)
            {
                /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
                count = Integer.MAX_VALUE;
                break;
            }
    
            while (true)
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
                break;
            }
        }
};