class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte dataCopy;
            {
                byte data;
    
                /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
                data = 2;
    
                dataCopy = data;
            }
            {
                byte data = dataCopy;
    
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Byte.MIN_VALUE, this will underflow */
                    byte result = (byte)(data * 2);
                    IO.writeLine("result: " + result);
                }
    
            }
        }
};