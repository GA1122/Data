class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data;
            if (privateReturnsTrue())
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MAX_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (privateReturnsTrue())
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                /* NOTE: Math.abs of the minimum int or long will return that same value, so we must check for it */
                if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long)Math.sqrt(Integer.MAX_VALUE)))
                {
                    int result = (int)(data * data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform squaring.");
                }
            }
        }
};