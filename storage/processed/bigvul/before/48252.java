class badSink_class{
    public void badSink(String password ) throws Throwable
        {
            if (CWE319_Cleartext_Tx_Sensitive_Info__connect_tcp_passwordAuth_22a.badPublicStatic)
            {
                if (password != null)
                {
                    /* POTENTIAL FLAW: Use password directly in PasswordAuthentication() */
                    PasswordAuthentication credentials = new PasswordAuthentication("user", password.toCharArray());
                    IO.writeLine(credentials.toString());
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure password is inititialized before the Sink to avoid compiler errors */
                password = null;
            }
        }
};