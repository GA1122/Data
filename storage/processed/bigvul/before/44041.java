class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Use a number larger than Short.MAX_VALUE */
            data = Short.MAX_VALUE + 5;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE197_Numeric_Truncation_Error__int_large_to_short_67b()).badSink(dataContainer  );
        }
};