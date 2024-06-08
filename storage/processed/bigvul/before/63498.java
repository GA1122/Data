class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            LinkedList<Integer> countLinkedList = new LinkedList<Integer>();
            countLinkedList.add(0, count);
            countLinkedList.add(1, count);
            countLinkedList.add(2, count);
            (new CWE400_Resource_Exhaustion__sleep_random_73b()).goodB2GSink(countLinkedList  );
        }
};