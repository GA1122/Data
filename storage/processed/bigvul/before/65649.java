class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: hardcode data to non-null */
            data = "This is not null";
    
            LinkedList<String> dataLinkedList = new LinkedList<String>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__String_73b()).goodG2BSink(dataLinkedList  );
        }
};