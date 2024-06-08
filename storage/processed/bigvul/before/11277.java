class bad_class{
    public void bad() throws Throwable
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
    
                /* FIX: Use a hardcoded string */
                data = "foo";
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.format(data);
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