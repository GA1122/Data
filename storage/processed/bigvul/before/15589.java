class bad_class{
    public void bad() throws Throwable
        {
            byte data = 0;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            badPublicStatic = true;
            (new CWE190_Integer_Overflow__byte_max_postinc_22b()).badSink(data );
        }
};