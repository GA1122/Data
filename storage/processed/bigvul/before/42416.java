class bad_class{
    public void bad() throws Throwable
        {
            short data = (new CWE191_Integer_Underflow__short_rand_postdec_61b()).badSource();
    
            /* POTENTIAL FLAW: if data == Short.MIN_VALUE, this will overflow */
            data--;
            short result = (short)(data);
    
            IO.writeLine("result: " + result);
    
        }
};