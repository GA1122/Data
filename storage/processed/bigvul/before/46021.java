class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Set data to a random value */
            data = (short)((new SecureRandom()).nextInt(Short.MAX_VALUE + 1));
    
            Vector<Short> dataVector = new Vector<Short>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE197_Numeric_Truncation_Error__short_random_72b()).badSink(dataVector  );
        }
};