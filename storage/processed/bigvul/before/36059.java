class bad_class{
    public void bad() throws Throwable
        {
            int data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MIN_VALUE;
            }
            else
            {
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
                data--;
                int result = (int)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
    
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Integer.MIN_VALUE)
                {
                    data--;
                    int result = (int)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
    
            }
        }
};