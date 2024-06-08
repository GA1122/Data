class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
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
            else
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