class bad_class{
    public void bad() throws Throwable
        {
            Integer data;
    
            /* POTENTIAL FLAW: data is null */
            data = null;
    
            LinkedList<Integer> dataLinkedList = new LinkedList<Integer>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE476_NULL_Pointer_Dereference__Integer_73b()).badSink(dataLinkedList  );
        }
};