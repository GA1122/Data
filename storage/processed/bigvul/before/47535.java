class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded string */
            data = "7e5tc4s3";
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE259_Hard_Coded_Password__driverManager_66b()).badSink(dataArray  );
        }
};