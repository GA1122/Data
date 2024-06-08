class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: if data == Integer.MAX_VALUE, this will overflow */
                int result = (int)(data + 1);
                IO.writeLine("result: " + result);
                break;
            }
    
        }
};