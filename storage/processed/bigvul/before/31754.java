class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            byte result = (byte)(data - 1);
    
            IO.writeLine("result: " + result);
    
        }
};