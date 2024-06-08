class badSink_class{
    public void badSink(byte data ) throws Throwable
        {
            if (CWE191_Integer_Underflow__byte_console_readLine_postdec_22a.badPublicStatic)
            {
                /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
                data--;
                byte result = (byte)(data);
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