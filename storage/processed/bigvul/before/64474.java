class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            CWE470_Unsafe_Reflection__Environment_81_base baseObject = new CWE470_Unsafe_Reflection__Environment_81_bad();
            baseObject.action(data );
        }
};