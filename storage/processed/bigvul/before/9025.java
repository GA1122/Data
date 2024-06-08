class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE129_Improper_Validation_of_Array_Index__random_array_size_67b()).badSink(dataContainer  );
        }
};