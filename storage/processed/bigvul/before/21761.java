class bad_class{
    public void bad() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
    
            badPublicStatic = true;
            (new CWE190_Integer_Overflow__int_max_multiply_22b()).badSink(data );
        }
};