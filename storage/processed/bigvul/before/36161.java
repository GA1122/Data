class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            CWE191_Integer_Underflow__int_min_postdec_81_base baseObject = new CWE191_Integer_Underflow__int_min_postdec_81_bad();
            baseObject.action(data );
        }
};