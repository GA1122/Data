class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            int count = CWE400_Resource_Exhaustion__max_value_for_loop_68a.count;
    
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