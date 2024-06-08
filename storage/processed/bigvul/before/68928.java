class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String data;
    
            switch (5)
            {
            case 6:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
                break;
            default:
                /* FIX: Use a hardcoded int as a string */
                data = "5";
                break;
            }
    
            switch (7)
            {
            case 7:
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
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};