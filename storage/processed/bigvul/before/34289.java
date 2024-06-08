class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
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
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                int result = (int)(--data);
                IO.writeLine("result: " + result);
                break;
            }
        }
};