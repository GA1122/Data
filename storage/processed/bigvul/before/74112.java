class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            int data;
    
            goodG2B2_private = true;
            data = goodG2B2_source();
    
            /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
            HashMap intHashMap = new HashMap(data);
    
        }
};