class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
    
            /* INCIDENTAL: CWE-798 Use of Hard-coded Credentials */
            PasswordAuthentication credentials = new PasswordAuthentication("user", "AP@ssw0rd".toCharArray());
    
            /* POTENTIAL FLAW: Set data to be a password, which can be transmitted over a non-secure
             * channel in the sink */
            data = new String(credentials.getPassword());
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};