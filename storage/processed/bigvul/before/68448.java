class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE606_Unchecked_Loop_Condition__Environment_66b()).badSink(dataArray  );
        }
};