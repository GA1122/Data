class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            CWE191_Integer_Underflow__int_min_predec_81_base baseObject = new CWE191_Integer_Underflow__int_min_predec_81_goodB2G();
            baseObject.action(data );
        }
};