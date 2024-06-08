class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: Set data to a random value */
                data = (new SecureRandom()).nextInt();
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
            HashMap intHashMap = new HashMap(data);
    
        }
};