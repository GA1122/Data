class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Initialize, but do not use data */
    
            data = 5L;
    
            CWE563_Unused_Variable__unused_value_long_81_base baseObject = new CWE563_Unused_Variable__unused_value_long_81_bad();
            baseObject.action(data );
        }
};