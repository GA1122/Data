class bad_class{
    public void bad() throws Throwable
        {
    
            /* INCIDENTAL: CWE-798 Use of Hard-coded Credentials */
            PasswordAuthentication credentials = new PasswordAuthentication("user", "AP@ssw0rd".toCharArray());
    
            /* POTENTIAL FLAW: Set data to be a password, which can be transmitted over a non-secure
             * channel in the sink */
            data = new String(credentials.getPassword());
    
            (new CWE319_Cleartext_Tx_Sensitive_Info__send_68b()).badSink();
        }
};