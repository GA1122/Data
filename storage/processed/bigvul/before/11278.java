class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                data = System.getenv("ADD");
            }
            else
            {
    
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                data = System.getenv("ADD");
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.format("%s%n", data);
                }
            }
            else
            {
    
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.format("%s%n", data);
                }
    
            }
        }
};