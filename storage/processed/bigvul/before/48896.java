class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String password;
    
            /* FIX: Use a hardcoded password as the password (it was not sent over the network) */
            /* INCIDENTAL FLAW: CWE-259 Hard Coded Password */
            password = "Password1234!";
    
            LinkedList<String> passwordLinkedList = new LinkedList<String>();
            passwordLinkedList.add(0, password);
            passwordLinkedList.add(1, password);
            passwordLinkedList.add(2, password);
            (new CWE319_Cleartext_Tx_Sensitive_Info__listen_tcp_passwordAuth_73b()).goodG2BSink(passwordLinkedList  );
        }
};