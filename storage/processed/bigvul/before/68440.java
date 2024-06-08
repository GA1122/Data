class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            (new CWE606_Unchecked_Loop_Condition__Environment_54b()).badSink(data );
        }
};