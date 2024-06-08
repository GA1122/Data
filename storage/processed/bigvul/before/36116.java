class bad_class{
    public void bad() throws Throwable
        {
            int data = (new CWE191_Integer_Underflow__int_min_postdec_61b()).badSource();
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};