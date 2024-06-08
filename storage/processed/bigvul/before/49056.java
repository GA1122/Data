class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a regular string (non-sensitive string) */
            data = "Hello World";
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE319_Cleartext_Tx_Sensitive_Info__send_67b()).goodG2BSink(dataContainer  );
        }
};