class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* FLAW: Set data to a hardcoded string */
            data = "7e5tc4s3";
    
            LinkedList<String> dataLinkedList = new LinkedList<String>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE259_Hard_Coded_Password__kerberosKey_73b()).badSink(dataLinkedList  );
        }
};