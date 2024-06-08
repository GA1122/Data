class badSink_class{
    public void badSink(CWE191_Integer_Underflow__long_min_postdec_67a.Container dataContainer ) throws Throwable
        {
            long data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};