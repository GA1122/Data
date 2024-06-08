class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            data = Short.MIN_VALUE; /* Initialize data */
    
            /* get environment variable ADD */
            /* FLAW: Read data from an environment variable */
            {
                String stringNumber = System.getenv("ADD");
                if (stringNumber != null) // avoid NPD incidental warnings
                {
                    try
                    {
                        data = Short.parseShort(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE197_Numeric_Truncation_Error__short_Environment_67b()).badSink(dataContainer  );
        }
};