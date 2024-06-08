class goodG2BSink_class{
    public void goodG2BSink(CWE191_Integer_Underflow__int_listen_tcp_multiply_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};