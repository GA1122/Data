class bad_class{
    public void bad() throws Throwable
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
    
            (new CWE197_Numeric_Truncation_Error__short_Property_68b()).badSink();
        }
};