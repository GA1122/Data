class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a value greater than the size of the array */
            data = 100;
    
            LinkedList<Integer> dataLinkedList = new LinkedList<Integer>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE129_Improper_Validation_of_Array_Index__large_fixed_array_size_73b()).goodB2GSink(dataLinkedList  );
        }
};