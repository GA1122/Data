class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = new StringBuilder("Good");
    
            CWE563_Unused_Variable__unused_value_StringBuilder_81_base baseObject = new CWE563_Unused_Variable__unused_value_StringBuilder_81_bad();
            baseObject.action(data );
        }
};