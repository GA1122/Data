class goodG2BSink_class{
    public void goodG2BSink(CWE191_Integer_Underflow__long_rand_postdec_67a.Container dataContainer ) throws Throwable
        {
            long data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};