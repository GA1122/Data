class badSink_class{
    public void badSink(CWE319_Cleartext_Tx_Sensitive_Info__URLConnection_passwordAuth_67a.Container passwordContainer ) throws Throwable
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