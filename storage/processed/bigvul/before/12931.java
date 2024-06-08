class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            data = System.getProperty("user.home");
    
            for (int k = 0; k < 1; k++)
            {
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.printf("%s%n", data);
                }
            }
        }
};