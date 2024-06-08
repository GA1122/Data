class bad_class{
    public void bad() throws Throwable
        {
            String data = null;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            badPublicStatic = true;
            (new CWE89_SQL_Injection__Environment_execute_22b()).badSink(data );
        }
};