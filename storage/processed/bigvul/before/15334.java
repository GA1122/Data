class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            CWE190_Integer_Overflow__byte_max_add_81_base baseObject = new CWE190_Integer_Overflow__byte_max_add_81_goodB2G();
            baseObject.action(data );
        }
};