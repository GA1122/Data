class badSink_class{
    public void badSink(LinkedList<Long> dataLinkedList ) throws Throwable
        {
            long data = dataLinkedList.remove(2);
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};