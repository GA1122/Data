class badSink_class{
    public void badSink(LinkedList<Long> dataLinkedList ) throws Throwable
        {
            long data = dataLinkedList.remove(2);
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};