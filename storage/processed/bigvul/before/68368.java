class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                data = System.getenv("ADD");
            }
            else
            {
    
                /* FIX: Use a hardcoded int as a string */
                data = "5";
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                int numberOfLoops;
                try
                {
                    numberOfLoops = Integer.parseInt(data);
                }
                catch (NumberFormatException exceptNumberFormat)
                {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
                for (int i=0; i < numberOfLoops; i++)
                {
                    /* POTENTIAL FLAW: user supplied input used for loop counter test */
                    IO.writeLine("hello world");
                }
            }
            else
            {
    
                int numberOfLoops;
                try
                {
                    numberOfLoops = Integer.parseInt(data);
                }
                catch (NumberFormatException exceptNumberFormat)
                {
                    IO.writeLine("Invalid response. Numeric input expected. Assuming 1.");
                    numberOfLoops = 1;
                }
    
                /* FIX: loop number thresholds validated */
                if (numberOfLoops >= 0 && numberOfLoops <= 5)
                {
                    for (int i=0; i < numberOfLoops; i++)
                    {
                        IO.writeLine("hello world");
                    }
                }
    
            }
        }
};