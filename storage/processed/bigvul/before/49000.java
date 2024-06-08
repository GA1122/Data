class bad_class{
    public void bad() throws Throwable
        {
            String data = null;
    
            /* INCIDENTAL: CWE-798 Use of Hard-coded Credentials */
            PasswordAuthentication credentials = new PasswordAuthentication("user", "AP@ssw0rd".toCharArray());
    
            /* POTENTIAL FLAW: Set data to be a password, which can be transmitted over a non-secure
             * channel in the sink */
            data = new String(credentials.getPassword());
    
            badPublicStatic = true;
            (new CWE319_Cleartext_Tx_Sensitive_Info__send_22b()).badSink(data );
        }
};