class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE129_Improper_Validation_of_Array_Index__random_array_read_check_min_66b()).badSink(dataArray  );
        }
};