class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                /* FIX: no backdoor exists */
                if ((new SecureRandom()).nextInt() == 20000)
                {
                    IO.writeLine("Sorry, your license has expired.  Please contact support.");
                }
            }
        }
};