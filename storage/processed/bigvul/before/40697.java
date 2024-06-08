class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long dataCopy;
            {
                long data;
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
                dataCopy = data;
            }
            {
                long data = dataCopy;
    
                /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
                long result = (long)(--data);
    
                IO.writeLine("result: " + result);
    
            }
        }
};