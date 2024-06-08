class goodB2GSink_class{
    public void goodB2GSink(CWE191_Integer_Underflow__short_min_sub_67a.Container dataContainer ) throws Throwable
        {
            short data = dataContainer.containerOne;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data > Short.MIN_VALUE)
            {
                short result = (short)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to perform subtraction.");
            }
    
        }
};