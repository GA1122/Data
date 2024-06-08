class goodB2GSink_class{
    public void goodB2GSink(CWE191_Integer_Underflow__long_rand_sub_67a.Container dataContainer ) throws Throwable
        {
            long data = dataContainer.containerOne;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data > Long.MIN_VALUE)
            {
                long result = (long)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to perform subtraction.");
            }
    
        }
};