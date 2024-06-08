class goodG2BSink_class{
    public void goodG2BSink(byte data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__byte_rand_sub_22a.goodG2BPublicStatic)
            {
                /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
                byte result = (byte)(data - 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
        }
};