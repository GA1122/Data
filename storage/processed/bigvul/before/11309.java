class bad_class{
    public void bad() throws Throwable
        {
            String data = null;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            badPublicStatic = true;
            (new CWE134_Uncontrolled_Format_String__Environment_format_22b()).badSink(data );
        }
};