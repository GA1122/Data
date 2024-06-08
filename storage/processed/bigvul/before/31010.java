class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MIN_VALUE;
    
            CWE191_Integer_Underflow__byte_min_postdec_81_base baseObject = new CWE191_Integer_Underflow__byte_min_postdec_81_goodB2G();
            baseObject.action(data );
        }
};