class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            LinkedList<Long> dataLinkedList = new LinkedList<Long>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE191_Integer_Underflow__long_min_predec_73b()).goodB2GSink(dataLinkedList  );
        }
};