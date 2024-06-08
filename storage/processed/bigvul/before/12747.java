class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            while (true)
            {
                /* get system property user.home */
                /* POTENTIAL FLAW: Read data from a system property */
                data = System.getProperty("user.home");
                break;
            }
    
            while (true)
            {
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.format(data);
                }
                break;
            }
        }
};