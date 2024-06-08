class goodG2BSink_class{
    public void goodG2BSink(CWE190_Integer_Overflow__int_listen_tcp_multiply_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Integer.MAX_VALUE, this will overflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};