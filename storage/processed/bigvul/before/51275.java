class goodB2G2_class{
    private void goodB2G2() throws Throwable
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
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};