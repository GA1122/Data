class badSink_class{
    public void badSink(CWE191_Integer_Underflow__int_console_readLine_postdec_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};