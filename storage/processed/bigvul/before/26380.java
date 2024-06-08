class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            LinkedList<Long> dataLinkedList = new LinkedList<Long>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE190_Integer_Overflow__long_max_add_73b()).goodB2GSink(dataLinkedList  );
        }
};