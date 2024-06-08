class goodG2BSink_class{
    public void goodG2BSink(LinkedList<Long> dataLinkedList ) throws Throwable
        {
            long data = dataLinkedList.remove(2);
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Long.MIN_VALUE, this will underflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};