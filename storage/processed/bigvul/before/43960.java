class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Use a number larger than Short.MAX_VALUE */
            data = Short.MAX_VALUE + 5;
    
            LinkedList<Integer> dataLinkedList = new LinkedList<Integer>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE197_Numeric_Truncation_Error__int_large_to_byte_73b()).badSink(dataLinkedList  );
        }
};