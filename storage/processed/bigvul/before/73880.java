class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* FLAW: Set data to Integer.MAX_VALUE */
                data = Integer.MAX_VALUE;
                break;
            }
    
            /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
            HashMap intHashMap = new HashMap(data);
    
        }
};