class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            LinkedList<Integer> countLinkedList = new LinkedList<Integer>();
            countLinkedList.add(0, count);
            countLinkedList.add(1, count);
            countLinkedList.add(2, count);
            (new CWE400_Resource_Exhaustion__max_value_write_73b()).goodB2GSink(countLinkedList  );
        }
};