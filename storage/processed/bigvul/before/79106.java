class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            dataGoodB2G = data;
            goodB2GSink();
        }
};