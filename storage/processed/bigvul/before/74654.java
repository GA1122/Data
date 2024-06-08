class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            for (int i = 0; i < 1; i++)
            {
                /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
                HashSet intHashSet = new HashSet(data);
            }
        }
};