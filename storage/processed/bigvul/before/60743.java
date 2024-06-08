class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count = (new CWE400_Resource_Exhaustion__max_value_for_loop_61b()).goodB2GSource();
    
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
};