class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
            if(IO.staticReturnsTrueOrFalse())
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
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: test for a zero denominator */
                if (data != 0)
                {
                    IO.writeLine("100/" + data + " = " + (100 / data) + "\n");
                }
                else
                {
                    IO.writeLine("This would result in a divide by zero");
                }
            }
            else
            {
    
                /* FIX: test for a zero denominator */
                if (data != 0)
                {
                    IO.writeLine("100/" + data + " = " + (100 / data) + "\n");
                }
                else
                {
                    IO.writeLine("This would result in a divide by zero");
                }
    
            }
        }
};