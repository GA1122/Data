class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            float data;
    
            data = -1.0f; /* Initialize data */
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read data from a system property */
            {
                String stringNumber = System.getProperty("user.home");
                if (stringNumber != null)
                {
                    try
                    {
                        data = Float.parseFloat(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing data from string", exceptNumberFormat);
                    }
                }
            }
    
            CWE369_Divide_by_Zero__float_Property_modulo_81_base baseObject = new CWE369_Divide_by_Zero__float_Property_modulo_81_goodB2G();
            baseObject.action(data );
        }
};