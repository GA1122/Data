class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            long[] dataArray = new long[5];
            dataArray[2] = data;
            (new CWE191_Integer_Underflow__long_min_sub_66b()).badSink(dataArray  );
        }
};