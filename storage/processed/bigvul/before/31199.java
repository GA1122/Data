class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            byte data;
            if (IO.staticReturnsTrue())
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Byte.MIN_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (IO.staticReturnsFalse())
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data > Byte.MIN_VALUE)
                {
                    byte result = (byte)(data - 1);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to perform subtraction.");
                }
    
            }
        }
};