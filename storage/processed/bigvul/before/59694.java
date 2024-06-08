class badSink_class{
    public void badSink(LinkedList<Integer> countLinkedList ) throws Throwable
        {
            int count = countLinkedList.remove(2);
    
            int i = 0;
    
            /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
            for (i = 0; i < count; i++)
            {
                IO.writeLine("Hello");
            }
    
        }
};