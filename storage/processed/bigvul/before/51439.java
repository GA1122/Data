class bad_class{
    public void bad() throws Throwable
        {
            float dataCopy;
            {
                float data;
    
                data = -1.0f; /* Initialize data */
    
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                {
                    String stringNumber = System.getenv("ADD");
                    if (stringNumber != null)
                    {
                        try
                        {
                            data = Float.parseFloat(stringNumber.trim());
                        }
                        catch (NumberFormatException exceptNumberFormat)
                        {
                            IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                        }
                    }
                }
    
                dataCopy = data;
            }
            {
                float data = dataCopy;
    
                /* POTENTIAL FLAW: Possibly modulo by zero */
                int result = (int)(100.0 % data);
                IO.writeLine(result);
    
            }
        }
};