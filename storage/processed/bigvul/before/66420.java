class good1_class{
    private void good1() throws Throwable
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
};