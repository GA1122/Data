class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE134_Uncontrolled_Format_String__Environment_format_67b()).badSink(dataContainer  );
        }
};