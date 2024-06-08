class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            CWE89_SQL_Injection__Environment_executeBatch_81_base baseObject = new CWE89_SQL_Injection__Environment_executeBatch_81_bad();
            baseObject.action(data );
        }
};