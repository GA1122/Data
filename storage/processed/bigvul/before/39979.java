class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MIN_VALUE;
    
            LinkedList<Long> dataLinkedList = new LinkedList<Long>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE191_Integer_Underflow__long_min_postdec_73b()).badSink(dataLinkedList  );
        }
};