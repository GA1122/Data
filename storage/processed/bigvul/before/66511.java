class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                /* FLAW: PRNG triggered backdoor */
                if ((new SecureRandom()).nextInt() == 20000)
                {
                    Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
                }
            }
        }
};