class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
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
    
            CWE129_Improper_Validation_of_Array_Index__Property_array_read_no_check_81_base baseObject = new CWE129_Improper_Validation_of_Array_Index__Property_array_read_no_check_81_goodB2G();
            baseObject.action(data );
        }
};