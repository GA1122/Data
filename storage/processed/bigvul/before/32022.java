class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data = (new CWE191_Integer_Underflow__int_connect_tcp_multiply_61b()).goodG2BSource();
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};