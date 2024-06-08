class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
                HashSet intHashSet = new HashSet(data);
    
            }
        }
};