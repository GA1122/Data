class bad_class{
    public void bad() throws Throwable
        {
            float data;
            if(IO.staticReturnsTrueOrFalse())
            {
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
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't a divide by zero */
                data = 2.0f;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
            }
            else
            {
    
                /* FIX: Check for value of or near zero before modulo */
                if (Math.abs(data) > 0.000001)
                {
                    int result = (int)(100.0 % data);
                    IO.writeLine(result);
                }
                else
                {
                    IO.writeLine("This would result in a modulo by zero");
                }
    
            }
        }
};