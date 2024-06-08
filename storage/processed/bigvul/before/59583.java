class bad_class{
    public void bad() throws Throwable
        {
            int count;
            if(IO.staticReturnsTrueOrFalse())
            {
                count = Integer.MIN_VALUE; /* Initialize count */
                /* get environment variable ADD */
                /* POTENTIAL FLAW: Read count from an environment variable */
                {
                    String stringNumber = System.getenv("ADD");
                    if (stringNumber != null) // avoid NPD incidental warnings
                    {
                        try
                        {
                            count = Integer.parseInt(stringNumber.trim());
                        }
                        catch(NumberFormatException exceptNumberFormat)
                        {
                            IO.logger.log(Level.WARNING, "Number format exception parsing count from string", exceptNumberFormat);
                        }
                    }
                }
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                count = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                int i = 0;
                /* POTENTIAL FLAW: For loop using count as the loop variant and no validation */
                for (i = 0; i < count; i++)
                {
                    IO.writeLine("Hello");
                }
            }
            else
            {
    
                int i = 0;
    
                /* FIX: Validate count before using it as the for loop variant */
                if (count > 0 && count <= 20)
                {
                    for (i = 0; i < count; i++)
                    {
                        IO.writeLine("Hello");
                    }
                }
    
            }
        }
};