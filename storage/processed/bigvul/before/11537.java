class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE134_Uncontrolled_Format_String__Environment_printf_66b()).badSink(dataArray  );
        }
};