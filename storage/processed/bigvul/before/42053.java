class bad_class{
    public void bad() throws Throwable
        {
            short data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MIN_VALUE;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
                short result = (short)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
    
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data > Short.MIN_VALUE)
                {
                    short result = (short)(data - 1);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to perform subtraction.");
                }
    
            }
        }
};