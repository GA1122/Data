class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            byte data;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
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
    
            if (PRIVATE_STATIC_FINAL_FIVE==5)
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