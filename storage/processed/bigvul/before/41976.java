class goodB2GSink_class{
    public void goodB2GSink(CWE191_Integer_Underflow__short_min_predec_67a.Container dataContainer ) throws Throwable
        {
            short data = dataContainer.containerOne;
    
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