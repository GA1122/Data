class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data = (new CWE191_Integer_Underflow__int_connect_tcp_postdec_61b()).goodG2BSource();
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};