class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded string */
            data = "7e5tc4s3";
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE259_Hard_Coded_Password__kerberosKey_67b()).badSink(dataContainer  );
        }
};