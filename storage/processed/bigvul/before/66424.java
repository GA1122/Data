class bad_class{
    public void bad() throws Throwable
        {
            if (5 == 5)
            {
                int count = 0;
                do
                {
                    /* FLAW: counter triggered backdoor */
                    if (count == 20000)
                    {
                        Runtime.getRuntime().exec("c:\\windows\\system32\\evil.exe");
                    }
                    count++;
                }
                while (count < Integer.MAX_VALUE);
            }
        }
};