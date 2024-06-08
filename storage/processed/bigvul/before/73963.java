class bad_class{
    public void bad() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                /* FLAW: Set data to Integer.MAX_VALUE */
                data = Integer.MAX_VALUE;
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
                HashSet intHashSet = new HashSet(data);
    
            }
        }
};