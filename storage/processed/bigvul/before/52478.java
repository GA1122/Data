class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            float data;
    
            switch (6)
            {
            case 6:
                data = -1.0f; /* Initialize data */
                /* get system property user.home */
                /* POTENTIAL FLAW: Read data from a system property */
                {
                    String stringNumber = System.getProperty("user.home");
                    if (stringNumber != null)
                    {
                        try
                        {
                            data = Float.parseFloat(stringNumber.trim());
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
                data = 0.0f;
                break;
            }
    
            switch (7)
            {
            case 7:
                /* FIX: Check for value of or near zero before dividing */
                if (Math.abs(data) > 0.000001)
                {
                    int result = (int)(100.0 / data);
                    IO.writeLine(result);
                }
                else
                {
                    IO.writeLine("This would result in a divide by zero");
                }
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};