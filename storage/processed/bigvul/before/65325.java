class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int [] data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            LinkedList<int []> dataLinkedList = new LinkedList<int []>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__int_array_73b()).goodB2GSink(dataLinkedList  );
        }
};