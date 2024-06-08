class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int count = 0;
    
            count = Integer.MIN_VALUE; /* Initialize count */
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read count from a system property */
            {
                String stringNumber = System.getProperty("user.home");
                try
                {
                    count = Integer.parseInt(stringNumber.trim());
                }
                catch(NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing count from string", exceptNumberFormat);
                }
            }
    
            goodB2G2PublicStatic = true;
            (new CWE400_Resource_Exhaustion__sleep_Property_22b()).goodB2G2Sink(count );
        }
};