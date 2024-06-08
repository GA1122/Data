class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (IO.staticFive==5)
            {
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                data = System.getenv("ADD");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.staticFive==5)
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
        }
};