class badSink_class{
    public void badSink(LinkedList<Integer> dataLinkedList ) throws Throwable
        {
            int data = dataLinkedList.remove(2);
    
            /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
            data++;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};