class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            CWE134_Uncontrolled_Format_String__Environment_format_81_base baseObject = new CWE134_Uncontrolled_Format_String__Environment_format_81_bad();
            baseObject.action(data );
        }
};