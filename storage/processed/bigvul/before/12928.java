class goodB2G_class{
    private void goodB2G() throws Throwable
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
                    /* FIX: explicitly defined string formatting */
                    System.out.printf("%s%n", data);
                }
                break;
            }
        }
};