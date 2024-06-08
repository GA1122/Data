class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE36_Absolute_Path_Traversal__Property_66b()).badSink(dataArray  );
        }
};