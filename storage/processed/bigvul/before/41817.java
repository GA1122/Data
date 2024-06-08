class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MIN_VALUE;
    
            short[] dataArray = new short[5];
            dataArray[2] = data;
            (new CWE191_Integer_Underflow__short_min_postdec_66b()).badSink(dataArray  );
        }
};