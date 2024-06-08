class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                int result = (int)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
    
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                int result = (int)(data - 1);
    
                IO.writeLine("result: " + result);
    
            }
        }
};