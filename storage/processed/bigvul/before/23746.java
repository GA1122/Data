class bad_class{
    public void bad() throws Throwable
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
    
            /* POTENTIAL FLAW: if (data*data) > Integer.MAX_VALUE, this will overflow */
            int result = (int)(data * data);
    
            IO.writeLine("result: " + result);
    
        }
};