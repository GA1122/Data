class bad_class{
    public void bad() throws Throwable
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
    
            Vector<Integer> countVector = new Vector<Integer>(5);
            countVector.add(0, count);
            countVector.add(1, count);
            countVector.add(2, count);
            (new CWE400_Resource_Exhaustion__Environment_write_72b()).badSink(countVector  );
        }
};