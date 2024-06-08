class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            byte[] dataArray = new byte[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__byte_max_add_66b()).badSink(dataArray  );
        }
};