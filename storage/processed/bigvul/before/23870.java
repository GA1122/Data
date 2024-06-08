class goodB2GSink_class{
    public void goodB2GSink(CWE190_Integer_Overflow__int_Property_square_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
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
};