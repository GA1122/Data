class goodB2GSink_class{
    public void goodB2GSink(CWE191_Integer_Underflow__int_database_sub_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data > Integer.MIN_VALUE)
            {
                int result = (int)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to perform subtraction.");
            }
    
        }
};