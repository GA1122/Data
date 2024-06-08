class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data = (new CWE191_Integer_Underflow__byte_rand_postdec_61b()).goodG2BSource();
    
            /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
            data--;
            byte result = (byte)(data);
    
            IO.writeLine("result: " + result);
    
        }
};