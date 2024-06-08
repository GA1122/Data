class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            while (true)
            {
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
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
                break;
            }
        }
};