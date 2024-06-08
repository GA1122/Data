class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int count = 0;
    
            count = Integer.MIN_VALUE; /* Initialize count */
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read count from an environment variable */
            {
                String stringNumber = System.getenv("ADD");
                if (stringNumber != null) // avoid NPD incidental warnings
                {
                    try
                    {
                        count = Integer.parseInt(stringNumber.trim());
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception parsing count from string", exceptNumberFormat);
                    }
                }
            }
    
            goodB2G2PublicStatic = true;
            (new CWE400_Resource_Exhaustion__sleep_Environment_22b()).goodB2G2Sink(count );
        }
};