class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Set data to Integer.MAX_VALUE */
            data = Integer.MAX_VALUE;
    
            LinkedList<Integer> dataLinkedList = new LinkedList<Integer>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE789_Uncontrolled_Mem_Alloc__max_value_HashMap_73b()).badSink(dataLinkedList  );
        }
};