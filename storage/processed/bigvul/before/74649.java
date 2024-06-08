class bad_class{
    public void bad() throws Throwable
        {
            int data = 0;
    
            switch (6)
            {
            case 6:
                /* POTENTIAL FLAW: Set data to a random value */
                data = (new SecureRandom()).nextInt();
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
                break;
            }
    
            /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
            HashSet intHashSet = new HashSet(data);
    
        }
};