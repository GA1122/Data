class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            (new CWE89_SQL_Injection__Environment_executeUpdate_71b()).badSink((Object)data  );
        }
};