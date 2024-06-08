class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a regular string (non-sensitive string) */
            data = "Hello World";
    
            CWE319_Cleartext_Tx_Sensitive_Info__send_81_base baseObject = new CWE319_Cleartext_Tx_Sensitive_Info__send_81_goodG2B();
            baseObject.action(data );
        }
};