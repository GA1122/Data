class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            count = Integer.MIN_VALUE; /* Initialize count */
    
            /* get system property user.home */
            /* POTENTIAL FLAW: Read count from a system property */
            {
                String stringNumber = System.getProperty("user.home");
                try
                {
                    count = Integer.parseInt(stringNumber.trim());
                }
                catch(NumberFormatException exceptNumberFormat)
                {
                    IO.logger.log(Level.WARNING, "Number format exception parsing count from string", exceptNumberFormat);
                }
            }
    
            HashMap<Integer,Integer> countHashMap = new HashMap<Integer,Integer>();
            countHashMap.put(0, count);
            countHashMap.put(1, count);
            countHashMap.put(2, count);
            (new CWE400_Resource_Exhaustion__Property_write_74b()).goodB2GSink(countHashMap  );
        }
};