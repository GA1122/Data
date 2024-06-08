class badSink_class{
    public void badSink() throws Throwable
        {
            int data = CWE191_Integer_Underflow__int_random_postdec_68a.data;
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};