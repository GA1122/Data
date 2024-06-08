class bad_class{
    public void bad() throws Throwable
        {
            long data = (new CWE191_Integer_Underflow__long_rand_postdec_61b()).badSource();
    
            /* POTENTIAL FLAW: if data == Long.MIN_VALUE, this will overflow */
            data--;
            long result = (long)(data);
    
            IO.writeLine("result: " + result);
    
        }
};