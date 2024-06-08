class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            LinkedList<Integer> dataLinkedList = new LinkedList<Integer>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE129_Improper_Validation_of_Array_Index__File_array_size_73b()).goodG2BSink(dataLinkedList  );
        }
};