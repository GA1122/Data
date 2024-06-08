class goodB2GSink_class{
    public void goodB2GSink(CWE190_Integer_Overflow__int_Property_add_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Integer.MAX_VALUE)
            {
                int result = (int)(data + 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to perform addition.");
            }
    
        }
};