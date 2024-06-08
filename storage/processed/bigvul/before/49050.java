class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a regular string (non-sensitive string) */
            data = "Hello World";
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE319_Cleartext_Tx_Sensitive_Info__send_66b()).goodG2BSink(dataArray  );
        }
};