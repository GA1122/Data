class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            short data = dataGoodB2G;
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Short.MIN_VALUE)
            {
                short result = (short)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};