class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded class name */
            data = "Testing.test";
    
            LinkedList<String> dataLinkedList = new LinkedList<String>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE470_Unsafe_Reflection__console_readLine_73b()).goodG2BSink(dataLinkedList  );
        }
};