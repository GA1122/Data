class goodB2G2_class{
    private void goodB2G2() throws Throwable
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
    
            goodB2G2PublicStatic = true;
            (new CWE129_Improper_Validation_of_Array_Index__Environment_array_read_check_min_22b()).goodB2G2Sink(data );
        }
};