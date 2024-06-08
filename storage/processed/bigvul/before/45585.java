class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: Use a number larger than Byte.MAX_VALUE */
                data = Byte.MAX_VALUE + 5;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};