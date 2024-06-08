class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE197_Numeric_Truncation_Error__int_random_to_short_66b()).badSink(dataArray  );
        }
};