class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            CWE90_LDAP_Injection__Environment_81_base baseObject = new CWE90_LDAP_Injection__Environment_81_bad();
            baseObject.action(data );
        }
};