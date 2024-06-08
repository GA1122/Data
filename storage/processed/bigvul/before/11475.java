class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            while (true)
            {
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                data = System.getenv("ADD");
                break;
            }
    
            while (true)
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.printf(data);
                }
                break;
            }
        }
};