class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            badPrivate = true;
            data = bad_source();
    
            /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
            HashSet intHashSet = new HashSet(data);
    
        }
};