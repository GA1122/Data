class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int count = (new CWE400_Resource_Exhaustion__random_for_loop_61b()).goodG2BSource();
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};