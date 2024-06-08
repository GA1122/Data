class bad_class{
    public void bad() throws Throwable
        {
            int count = (new CWE400_Resource_Exhaustion__Property_for_loop_61b()).badSource();
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};