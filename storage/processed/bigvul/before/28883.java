class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            short data;
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MAX_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (privateFive!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < Short.MAX_VALUE)
                {
                    data++;
                    short result = (short)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to increment.");
                }
    
            }
        }
};