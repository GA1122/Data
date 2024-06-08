class goodG2BSink_class{
    public void goodG2BSink(CWE319_Cleartext_Tx_Sensitive_Info__listen_tcp_passwordAuth_67a.Container passwordContainer ) throws Throwable
        {
            String password = passwordContainer.containerOne;
    
            if (password != null)
            {
                /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                IO.writeLine(credentials.toString());
            }
    
        }
};