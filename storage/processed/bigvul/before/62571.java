class bad_class{
    public void bad() throws Throwable
        {
            int countCopy;
            {
                int count;
    
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
    
                countCopy = count;
            }
            {
                int count = countCopy;
    
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
    
            }
        }
};