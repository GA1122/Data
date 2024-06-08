class goodG2BSink_class{
    public void goodG2BSink(byte data ) throws Throwable
        {
            if (CWE190_Integer_Overflow__byte_console_readLine_add_22a.goodG2BPublicStatic)
            {
                /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data + 1);
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