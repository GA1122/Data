class bad_class{
    public void bad() throws Throwable
        {
            String password = (new CWE319_Cleartext_Tx_Sensitive_Info__listen_tcp_passwordAuth_61b()).badSource();
    
            if (password != null)
            {
                /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};