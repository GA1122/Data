class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            while (true)
            {
                data = Short.MIN_VALUE; /* Initialize data */
                /* get system property user.home */
                /* FLAW: Read data from a system property */
                {
                    String stringNumber = System.getProperty("user.home");
                    try
                    {
                        data = Short.parseShort(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
                break;
            }
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};