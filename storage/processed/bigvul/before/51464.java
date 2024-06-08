class goodB2G_class{
    private void goodB2G() throws Throwable
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
    
            float[] dataArray = new float[5];
            dataArray[2] = data;
            (new CWE369_Divide_by_Zero__float_Environment_modulo_66b()).goodB2GSink(dataArray  );
        }
};