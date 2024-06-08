class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
    
            CWE190_Integer_Overflow__int_max_multiply_81_base baseObject = new CWE190_Integer_Overflow__int_max_multiply_81_bad();
            baseObject.action(data );
        }
};