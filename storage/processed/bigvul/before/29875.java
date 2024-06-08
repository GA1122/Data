class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            LinkedList<Short> dataLinkedList = new LinkedList<Short>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE190_Integer_Overflow__short_rand_preinc_73b()).goodG2BSink(dataLinkedList  );
        }
};