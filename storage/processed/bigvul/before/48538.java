class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String password;
    
            /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
            /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
            password = "Password1234!";
    
            CWE319_Cleartext_Tx_Sensitive_Info__listen_tcp_driverManager_81_base baseObject = new CWE319_Cleartext_Tx_Sensitive_Info__listen_tcp_driverManager_81_goodG2B();
            baseObject.action(password );
        }
};