class bad_class{
    public void bad() throws Throwable
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
    
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Integer.MAX_VALUE, this will overflow */
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
    
            }
        }
};