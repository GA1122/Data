class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            CWE15_External_Control_of_System_or_Configuration_Setting__Environment_81_base baseObject = new CWE15_External_Control_of_System_or_Configuration_Setting__Environment_81_bad();
            baseObject.action(data );
        }
};