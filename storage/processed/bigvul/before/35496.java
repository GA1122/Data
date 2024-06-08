class goodG2BSink_class{
    public void goodG2BSink(CWE191_Integer_Underflow__int_listen_tcp_postdec_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: if data == Integer.MIN_VALUE, this will overflow */
            data--;
            int result = (int)(data);
    
            IO.writeLine("result: " + result);
    
        }
};