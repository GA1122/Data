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
    
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                data--;
                int result = (int)(data);
    
                IO.writeLine("result: " + result);
    
            }
        }
};