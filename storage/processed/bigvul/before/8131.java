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
    
                int array[] = null;
    
                /* POTENTIAL FLAW: Verify that data is non-negative, but still allow it to be 0 */
                if (data >= 0)
                {
                    array = new int[data];
                }
                else
                {
                    IO.writeLine("Array size is negative");
                }
    
                /* do something with the array */
                array[0] = 5;
                IO.writeLine(array[0]);
    
            }
        }
};