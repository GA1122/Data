class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            int data;
    
            goodG2B1_private = false;
            data = goodG2B1_source();
    
            /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
            HashSet intHashSet = new HashSet(data);
    
        }
};