class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            while (true)
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
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Possibly divide by zero */
                int result = (int)(100.0 / data);
                IO.writeLine(result);
                break;
            }
        }
};