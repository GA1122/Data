class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                data = System.getenv("ADD");
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.printf(data);
                }
    
            }
        }
};