class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            for (int j = 0; j < 1; j++)
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Short.MAX_VALUE, this will overflow */
                    short result = (short)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};