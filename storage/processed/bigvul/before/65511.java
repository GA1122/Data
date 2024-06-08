class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: hardcode data to non-null */
            data = new StringBuilder();
    
            LinkedList<StringBuilder> dataLinkedList = new LinkedList<StringBuilder>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_73b()).goodG2BSink(dataLinkedList  );
        }
};