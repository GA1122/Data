class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded string */
            data = "7e5tc4s3";
    
            CWE259_Hard_Coded_Password__driverManager_81_base baseObject = new CWE259_Hard_Coded_Password__driverManager_81_bad();
            baseObject.action(data );
        }
};