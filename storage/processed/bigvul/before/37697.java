class bad_class{
    public void bad() throws Throwable
        {
            int dataCopy;
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
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                int result = (int)(data - 1);
    
                IO.writeLine("result: " + result);
    
            }
        }
};