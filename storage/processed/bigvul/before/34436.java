class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            switch (6)
            {
            case 6:
                data = Integer.MIN_VALUE; /* Initialize data */
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                {
                    String stringNumber = System.getenv("ADD");
                    if (stringNumber != null) // avoid NPD incidental warnings
                    {
                        try
                        {
                            data = Integer.parseInt(stringNumber.trim());
                        }
                        catch(NumberFormatException exceptNumberFormat)
                        {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
                break;
            }
    
            switch (7)
            {
            case 7:
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                int result = (int)(data - 1);
                IO.writeLine("result: " + result);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};