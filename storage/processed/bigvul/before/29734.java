class badSink_class{
    public void badSink(LinkedList<Short> dataLinkedList ) throws Throwable
        {
            short data = dataLinkedList.remove(2);
    
            /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
            data++;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};