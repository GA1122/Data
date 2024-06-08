class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE15_External_Control_of_System_or_Configuration_Setting__Property_67b()).badSink(dataContainer  );
        }
};