class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            for (int j = 0; j < 1; j++)
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.format(data);
                }
            }
        }
};