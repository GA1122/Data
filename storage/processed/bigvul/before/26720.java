class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            CWE190_Integer_Overflow__long_max_postinc_81_base baseObject = new CWE190_Integer_Overflow__long_max_postinc_81_goodB2G();
            baseObject.action(data );
        }
};