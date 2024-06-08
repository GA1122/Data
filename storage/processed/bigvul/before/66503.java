class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticFive == 5)
            {
                /* FLAW: PRNG triggered backdoor */
                if ((new SecureRandom()).nextInt() == 20000)
                {
                    Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
                }
            }
        }
};