class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data = 0;
    
            data = Integer.MIN_VALUE; /* Initialize data */
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            {
                String stringNumber = System.getenv("ADD");
                if (stringNumber != null) // avoid NPD incidental warnings
                {
                    try
                    {
                        data = Integer.parseInt(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
    
            goodB2G1PublicStatic = false;
            (new CWE191_Integer_Underflow__int_Environment_predec_22b()).goodB2G1Sink(data );
        }
};