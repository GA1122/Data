class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            LinkedList<String> dataLinkedList = new LinkedList<String>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE78_OS_Command_Injection__connect_tcp_73b()).goodG2BSink(dataLinkedList  );
        }
};