class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MIN_VALUE;
    
            CWE191_Integer_Underflow__short_min_multiply_81_base baseObject = new CWE191_Integer_Underflow__short_min_multiply_81_bad();
            baseObject.action(data );
        }
};