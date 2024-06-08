class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            Integer data;
    
            /* FIX: hardcode data to non-null */
            data = Integer.valueOf(5);
    
            LinkedList<Integer> dataLinkedList = new LinkedList<Integer>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__Integer_73b()).goodG2BSink(dataLinkedList  );
        }
};