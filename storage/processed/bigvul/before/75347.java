class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            LinkedList<String> dataLinkedList = new LinkedList<String>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE78_OS_Command_Injection__Environment_73b()).badSink(dataLinkedList  );
        }
};