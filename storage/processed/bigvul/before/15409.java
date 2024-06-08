class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data;
    
            while (true)
            {
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
                break;
            }
    
            while (true)
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                    byte result = (byte)(data * 2);
                    IO.writeLine("result: " + result);
                }
                break;
            }
    
        }
};