class bad_class{
    public void bad() throws Throwable
        {
            short dataCopy;
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
    
                dataCopy = data;
            }
            {
                short data = dataCopy;
    
                {
                    /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                    IO.writeLine((byte)data);
                }
    
            }
        }
};