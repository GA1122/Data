class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            long[] dataArray = new long[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__long_max_postinc_66b()).badSink(dataArray  );
        }
};