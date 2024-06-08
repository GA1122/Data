class bad_class{
    public void bad() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                /* POTENTIAL FLAW: Set data to a random value */
                data = (new SecureRandom()).nextInt();
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
                HashSet intHashSet = new HashSet(data);
    
            }
        }
};