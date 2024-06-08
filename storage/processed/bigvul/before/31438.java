class badSink_class{
    public void badSink(LinkedList<Byte> dataLinkedList ) throws Throwable
        {
            byte data = dataLinkedList.remove(2);
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Byte.MIN_VALUE, this will underflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};