class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int count;
    
            switch (6)
            {
            case 6:
                count = Integer.MIN_VALUE; /* Initialize count */
                /* get system property user.home */
                /* POTENTIAL FLAW: Read count from a system property */
                {
                    String stringNumber = System.getProperty("user.home");
                    try
                    {
                        count = Integer.parseInt(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing count from string", exceptNumberFormat);
                    }
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure count is inititialized before the Sink to avoid compiler errors */
                count = 0;
                break;
            }
    
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
                int i = 0;
                /* FIX: Validate count before using it as the for loop variant */
                if (count > 0 && count <= 20)
                {
                    for (i = 0; i < count; i++)
                    {
                        IO.writeLine("Hello");
                    }
                }
                break;
            }
        }
};