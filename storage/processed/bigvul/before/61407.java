class bad_class{
    public void bad() throws Throwable
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
    
            badPublicStatic = true;
            (new CWE400_Resource_Exhaustion__Property_for_loop_22b()).badSink(count );
        }
};