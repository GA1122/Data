class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short dataCopy;
            {
                short data;
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
                dataCopy = data;
            }
            {
                short data = dataCopy;
    
                /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
                short result = (short)(data - 1);
    
                IO.writeLine("result: " + result);
    
            }
        }
};