class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            long data = dataGoodB2G;
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Long.MIN_VALUE)
            {
                data--;
                long result = (long)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};