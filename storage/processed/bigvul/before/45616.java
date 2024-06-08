class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Use a number larger than Byte.MAX_VALUE */
            data = Byte.MAX_VALUE + 5;
    
            short[] dataArray = new short[5];
            dataArray[2] = data;
            (new CWE197_Numeric_Truncation_Error__short_large_66b()).badSink(dataArray  );
        }
};