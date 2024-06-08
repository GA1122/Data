class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            float data;
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
                SecureRandom secureRandom = new SecureRandom();
                data = secureRandom.nextFloat();
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0.0f;
            }
    
            if (privateFive==5)
            {
                /* FIX: Check for value of or near zero before dividing */
                if (Math.abs(data) > 0.000001)
                {
                    int result = (int)(100.0 / data);
                    IO.writeLine(result);
                }
                else
                {
                    IO.writeLine("This would result in a divide by zero");
                }
            }
        }
};