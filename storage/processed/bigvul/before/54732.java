class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                data = Integer.MIN_VALUE; /* Initialize data */
    
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read data from an environment variable */
                {
                    String stringNumber = System.getenv("ADD");
                    if (stringNumber != null) // avoid NPD incidental warnings
                    {
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
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                /* FIX: test for a zero modulus */
                if (data != 0)
                {
                    IO.writeLine("100%" + data + " = " + (100 % data) + "\n");
                }
                else
                {
                    IO.writeLine("This would result in a modulo by zero");
                }
    
            }
        }
};