class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            CWE643_Xpath_Injection__Environment_81_base baseObject = new CWE643_Xpath_Injection__Environment_81_goodB2G();
            baseObject.action(data );
        }
};