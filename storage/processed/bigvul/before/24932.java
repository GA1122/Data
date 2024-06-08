class badSink_class{
    public void badSink(CWE190_Integer_Overflow__int_URLConnection_multiply_67a.Container dataContainer ) throws Throwable
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