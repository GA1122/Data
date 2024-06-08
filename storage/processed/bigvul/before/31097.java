class bad_class{
    public void bad() throws Throwable
        {
            byte data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MIN_VALUE;
    
            badPublicStatic = true;
            (new CWE191_Integer_Underflow__byte_min_predec_22b()).badSink(data );
        }
};