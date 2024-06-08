class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: Set data to Integer.MAX_VALUE */
                data = Integer.MAX_VALUE;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
            HashSet intHashSet = new HashSet(data);
    
        }
};