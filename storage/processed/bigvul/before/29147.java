class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MAX_VALUE;
    
            CWE190_Integer_Overflow__short_max_preinc_81_base baseObject = new CWE190_Integer_Overflow__short_max_preinc_81_bad();
            baseObject.action(data );
        }
};