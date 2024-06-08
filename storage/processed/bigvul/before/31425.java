class goodG2BSink_class{
    public void goodG2BSink() throws Throwable
        {
            byte data = CWE191_Integer_Underflow__byte_rand_multiply_68a.data;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Byte.MIN_VALUE, this will underflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};