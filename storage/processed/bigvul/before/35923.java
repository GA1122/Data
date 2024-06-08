class bad_class{
    public void bad() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            badPublicStatic = true;
            (new CWE191_Integer_Underflow__int_min_multiply_22b()).badSink(data );
        }
};