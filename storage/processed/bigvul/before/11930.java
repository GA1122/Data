class badSink_class{
    public void badSink(LinkedList<String> dataLinkedList ) throws Throwable
        {
            String data = dataLinkedList.remove(2);
    
            if (data != null)
            {
                /* POTENTIAL FLAW: uncontrolled string formatting */
                System.out.printf(data);
            }
    
        }
};