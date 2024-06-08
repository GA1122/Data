class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            for (int i = 0; i < 1; i++)
            {
                /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
                HashMap intHashMap = new HashMap(data);
            }
        }
};