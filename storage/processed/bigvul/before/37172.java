class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
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
    
            for (int j = 0; j < 1; j++)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                    int result = (int)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};