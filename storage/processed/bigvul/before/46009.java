class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Set data to a random value */
            data = (short)((new SecureRandom()).nextInt(Short.MAX_VALUE + 1));
    
            short[] dataArray = new short[5];
            dataArray[2] = data;
            (new CWE197_Numeric_Truncation_Error__short_random_66b()).badSink(dataArray  );
        }
};