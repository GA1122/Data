class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
            {
                /* FIX: no backdoor exists */
                if ((new SecureRandom()).nextInt() == 20000)
                {
                    IO.writeLine("Sorry, your license has expired.  Please contact support.");
                }
            }
        }
};