class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FIX: no backdoor exists */
                if ((new SecureRandom()).nextInt() == 20000)
                {
                    IO.writeLine("Sorry, your license has expired.  Please contact support.");
                }
            }
            else
            {
    
                /* FIX: no backdoor exists */
                if ((new SecureRandom()).nextInt() == 20000)
                {
                    IO.writeLine("Sorry, your license has expired.  Please contact support.");
                }
    
            }
        }
};