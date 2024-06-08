class good1_class{
    private void good1() throws Throwable
        {
            if (privateReturnsFalse())
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
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