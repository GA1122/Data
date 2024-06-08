class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * count is uninitialized
             */
    
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
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: Use count as the input to Thread.sleep() */
                Thread.sleep(count);
            }
        }
};