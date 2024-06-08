class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticFive == 5)
            {
                int count = 0;
                do
                {
                    /* FIX: no backdoor exists */
                    if (count == 20000)
                    {
                        IO.writeLine("Sorry, your license has expired.  Please contact support.");
                    }
                    count++;
                }
                while (count < Integer.MAX_VALUE);
            }
        }
};