class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Byte.MAX_VALUE;
    
            LinkedList<Byte> dataLinkedList = new LinkedList<Byte>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE190_Integer_Overflow__byte_max_postinc_73b()).goodB2GSink(dataLinkedList  );
        }
};