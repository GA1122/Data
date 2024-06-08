class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            CWE191_Integer_Underflow__long_min_multiply_81_base baseObject = new CWE191_Integer_Underflow__long_min_multiply_81_bad();
            baseObject.action(data );
        }
};