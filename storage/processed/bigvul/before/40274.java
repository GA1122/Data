class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            CWE191_Integer_Underflow__long_min_sub_81_base baseObject = new CWE191_Integer_Underflow__long_min_sub_81_goodB2G();
            baseObject.action(data );
        }
};