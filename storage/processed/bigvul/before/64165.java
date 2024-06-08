class badSink_class{
    public void badSink(LinkedList<String> dataLinkedList ) throws Throwable
        {
            String data = dataLinkedList.remove(2);
    
            /* POTENTIAL FLAW: Instantiate object of class named in data (which may be from external input) */
            Class<?> tempClass = Class.forName(data);
            Object tempClassObject = tempClass.newInstance();
    
            IO.writeLine(tempClassObject.toString()); /* Use tempClassObject in some way */
    
        }
};