class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int count;
    
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
    
            goodB2G1Private = false;
            goodB2G1Sink(count );
        }
};