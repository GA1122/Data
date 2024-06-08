class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            LinkedList<Integer> dataLinkedList = new LinkedList<Integer>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE789_Uncontrolled_Mem_Alloc__random_HashSet_73b()).badSink(dataLinkedList  );
        }
};