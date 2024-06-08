class goodB2GSink_class{
    public void goodB2GSink(CWE191_Integer_Underflow__int_Property_predec_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Integer.MIN_VALUE)
            {
                int result = (int)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};