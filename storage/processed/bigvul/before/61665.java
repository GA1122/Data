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
    
            LinkedList<Integer> countLinkedList = new LinkedList<Integer>();
            countLinkedList.add(0, count);
            countLinkedList.add(1, count);
            countLinkedList.add(2, count);
            (new CWE400_Resource_Exhaustion__Property_write_73b()).badSink(countLinkedList  );
        }
};