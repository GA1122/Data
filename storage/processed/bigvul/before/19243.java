class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
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
    
            LinkedList<Integer> dataLinkedList = new LinkedList<Integer>();
            dataLinkedList.add(0, data);
            dataLinkedList.add(1, data);
            dataLinkedList.add(2, data);
            (new CWE190_Integer_Overflow__int_Environment_add_73b()).badSink(dataLinkedList  );
        }
};