class badSink_class{
    public void badSink(LinkedList<Short> dataLinkedList ) throws Throwable
        {
            short data = dataLinkedList.remove(2);
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Short.MIN_VALUE, this will underflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};