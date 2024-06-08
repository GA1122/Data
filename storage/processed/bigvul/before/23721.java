class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            int data = CWE190_Integer_Overflow__int_Property_preinc_68a.data;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Integer.MAX_VALUE)
            {
                int result = (int)(++data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};