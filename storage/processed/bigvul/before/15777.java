class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            byte data = CWE190_Integer_Overflow__byte_max_preinc_68a.data;
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Byte.MAX_VALUE)
            {
                byte result = (byte)(++data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to increment.");
            }
    
        }
};