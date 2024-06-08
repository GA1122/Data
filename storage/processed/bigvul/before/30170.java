class badSink_class{
    public void badSink(CWE191_Integer_Underflow__byte_console_readLine_multiply_67a.Container dataContainer ) throws Throwable
        {
            byte data = dataContainer.containerOne;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Byte.MIN_VALUE, this will underflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};