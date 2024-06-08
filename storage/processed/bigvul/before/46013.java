class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Set data to a random value */
            data = (short)((new SecureRandom()).nextInt(Short.MAX_VALUE + 1));
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE197_Numeric_Truncation_Error__short_random_67b()).badSink(dataContainer  );
        }
};