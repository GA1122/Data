class badSink_class{
    public void badSink() throws Throwable
        {
            String password = CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_passwordAuth_68a.password;
    
            if (password != null)
            {
                /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};