class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: PRNG triggered backdoor */
                if ((new SecureRandom()).nextInt() == 20000)
                {
                    Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
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