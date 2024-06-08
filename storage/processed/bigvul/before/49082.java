class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* INCIDENTAL: CWE-798 Use of Hard-coded Credentials */
            PasswordAuthentication credentials = new PasswordAuthentication("user", "AP@ssw0rd".toCharArray());
    
            /* POTENTIAL FLAW: Set data to be a password, which can be transmitted over a non-secure
             * channel in the sink */
            data = new String(credentials.getPassword());
    
            HashMap<Integer,String> dataHashMap = new HashMap<Integer,String>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE319_Cleartext_Tx_Sensitive_Info__send_74b()).badSink(dataHashMap  );
        }
};