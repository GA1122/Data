class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Use a number larger than Byte.MAX_VALUE */
            data = Byte.MAX_VALUE + 5;
    
            LinkedList<Short> dataLinkedList = new LinkedList<Short>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE197_Numeric_Truncation_Error__short_large_73b()).badSink(dataLinkedList  );
        }
};