class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            LinkedList<Long> dataLinkedList = new LinkedList<Long>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE190_Integer_Overflow__long_rand_multiply_73b()).badSink(dataLinkedList  );
        }
};