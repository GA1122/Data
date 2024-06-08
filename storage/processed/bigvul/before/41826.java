class badSink_class{
    public void badSink(CWE191_Integer_Underflow__short_min_postdec_67a.Container dataContainer ) throws Throwable
        {
            short data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};