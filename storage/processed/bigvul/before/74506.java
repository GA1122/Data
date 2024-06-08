class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Set data to a random value */
                data = (new SecureRandom()).nextInt();
                break;
            }
    
            /* POTENTIAL FLAW: Create an ArrayList using data as the initial size.  data may be very large, creating memory issues */
            ArrayList intArrayList = new ArrayList(data);
    
        }
};