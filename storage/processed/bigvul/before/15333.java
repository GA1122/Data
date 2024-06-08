class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            CWE190_Integer_Overflow__byte_max_add_81_base baseObject = new CWE190_Integer_Overflow__byte_max_add_81_bad();
            baseObject.action(data );
        }
};