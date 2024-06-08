class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            CWE90_LDAP_Injection__listen_tcp_81_base baseObject = new CWE90_LDAP_Injection__listen_tcp_81_goodG2B();
            baseObject.action(data );
        }
};