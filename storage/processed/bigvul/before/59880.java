class goodB2G_class{
    private void goodB2G() throws Throwable
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
    
            HashMap<Integer,Integer> countHashMap = new HashMap<Integer,Integer>();
            countHashMap.put(0, count);
            countHashMap.put(1, count);
            countHashMap.put(2, count);
            (new CWE400_Resource_Exhaustion__Environment_write_74b()).goodB2GSink(countHashMap  );
        }
};