class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            long data = dataGoodB2G;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Long.MAX_VALUE)
            {
                long result = (long)(++data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};