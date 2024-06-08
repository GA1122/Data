class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            (new CWE134_Uncontrolled_Format_String__Environment_format_53b()).goodB2GSink(data );
        }
};