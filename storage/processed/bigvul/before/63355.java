class bad_class{
    public void bad() throws Throwable
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
    
            Vector<Integer> countVector = new Vector<Integer>(5);
            countVector.add(0, count);
            countVector.add(1, count);
            countVector.add(2, count);
            (new CWE400_Resource_Exhaustion__sleep_Property_72b()).badSink(countVector  );
        }
};