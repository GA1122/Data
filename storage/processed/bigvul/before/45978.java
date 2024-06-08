class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if (IO.staticReturnsTrueOrFalse())
            {
                /* FLAW: Set data to a random value */
                data = (short)((new SecureRandom()).nextInt(Short.MAX_VALUE + 1));
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