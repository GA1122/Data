class badSink_class{
    public void badSink() throws Throwable
        {
            long data = CWE191_Integer_Underflow__long_min_postdec_68a.data;
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};