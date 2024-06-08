class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE78_OS_Command_Injection__Environment_66b()).badSink(dataArray  );
        }
};