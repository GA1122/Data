class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            LinkedList<StringBuilder> dataLinkedList = new LinkedList<StringBuilder>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__StringBuilder_73b()).badSink(dataLinkedList  );
        }
};