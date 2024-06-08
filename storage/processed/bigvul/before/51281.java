class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            float data = 0.0f;
    
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
    
            goodB2G2PublicStatic = true;
            (new CWE369_Divide_by_Zero__float_Environment_divide_22b()).goodB2G2Sink(data );
        }
};