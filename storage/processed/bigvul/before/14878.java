class goodG2BSink_class{
    public void goodG2BSink(LinkedList<Byte> dataLinkedList ) throws Throwable
        {
            byte data = dataLinkedList.remove(2);
    
            /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
            data++;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};