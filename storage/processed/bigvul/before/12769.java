class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* get system property user.home */
                /* POTENTIAL FLAW: Read data from a system property */
                data = System.getProperty("user.home");
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                if (data != null)
                {
                    /* POTENTIAL FLAW: uncontrolled string formatting */
                    System.out.format(data);
                }
    
            }
        }
};