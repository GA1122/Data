class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = null;
    
            /* FIX: Use a regular string (non-sensitive string) */
            data = "Hello World";
    
            goodG2BPublicStatic = true;
            (new CWE319_Cleartext_Tx_Sensitive_Info__send_22b()).goodG2BSink(data );
        }
};