class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data = null;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            goodB2G1PublicStatic = false;
            (new CWE134_Uncontrolled_Format_String__Environment_format_22b()).goodB2G1Sink(data );
        }
};