class goodB2GSink_class{
    public void goodB2GSink(CWE400_Resource_Exhaustion__console_readLine_for_loop_67a.Container countContainer ) throws Throwable
        {
            int count = countContainer.containerOne;
    
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