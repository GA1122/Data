class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
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
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: Zero modulus will cause an issue.  An integer division will
                result in an exception.  */
                IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
            }
        }
};