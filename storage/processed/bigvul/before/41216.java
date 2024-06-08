class goodG2BSink_class{
    public void goodG2BSink(LinkedList<Short> dataLinkedList ) throws Throwable
        {
            short data = dataLinkedList.remove(2);
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};