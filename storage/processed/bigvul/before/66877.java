class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5;
    
            CWE563_Unused_Variable__unused_init_variable_int_81_base baseObject = new CWE563_Unused_Variable__unused_init_variable_int_81_bad();
            baseObject.action(data );
        }
};