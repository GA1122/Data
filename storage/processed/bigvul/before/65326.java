class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int [] data;
    
            /* FIX: hardcode data to non-null */
            data = new int[5];
    
            LinkedList<int []> dataLinkedList = new LinkedList<int []>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__int_array_73b()).goodG2BSink(dataLinkedList  );
        }
};