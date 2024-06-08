class goodB2GSink_class{
    public void goodB2GSink(Object dataObject ) throws Throwable
        {
            short data = (Short)dataObject;
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Short.MIN_VALUE)
            {
                data--;
                short result = (short)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};