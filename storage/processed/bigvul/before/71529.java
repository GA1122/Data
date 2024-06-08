class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: call getStringGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
    
            LinkedList<String> dataLinkedList = new LinkedList<String>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE690_NULL_Deref_From_Return__Class_String_73b()).goodG2BSink(dataLinkedList  );
        }
};