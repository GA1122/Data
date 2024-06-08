class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MAX_VALUE;
    
            short[] dataArray = new short[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__short_max_multiply_66b()).badSink(dataArray  );
        }
};