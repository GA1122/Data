class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data = 0;
    
            data = Integer.MIN_VALUE; /* Initialize data */
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            {
                String stringNumber = System.getProperty("user.home");
                try
                {
                    data = Integer.parseInt(stringNumber.trim());
                }
                catch(NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                }
            }
    
            goodB2G1PublicStatic = false;
            (new CWE129_Improper_Validation_of_Array_Index__Property_array_size_22b()).goodB2G1Sink(data );
        }
};