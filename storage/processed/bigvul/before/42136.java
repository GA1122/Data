class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MIN_VALUE;
    
            CWE191_Integer_Underflow__short_min_sub_81_base baseObject = new CWE191_Integer_Underflow__short_min_sub_81_goodB2G();
            baseObject.action(data );
        }
};