class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data = (new CWE191_Integer_Underflow__byte_min_multiply_61b()).goodG2BSource();
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Byte.MIN_VALUE, this will underflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};