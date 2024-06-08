class goodG2BSink_class{
    public void goodG2BSink(LinkedList<Integer> dataLinkedList ) throws Throwable
        {
            int data = dataLinkedList.remove(2);
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};