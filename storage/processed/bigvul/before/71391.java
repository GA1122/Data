class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            StringBuilder data;
    
            /* FIX: call getStringBuilderGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
    
            LinkedList<StringBuilder> dataLinkedList = new LinkedList<StringBuilder>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_73b()).goodG2BSink(dataLinkedList  );
        }
};