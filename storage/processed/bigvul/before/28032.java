class badSink_class{
    public void badSink(CWE190_Integer_Overflow__short_console_readLine_multiply_67a.Container dataContainer ) throws Throwable
        {
            short data = dataContainer.containerOne;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Short.MAX_VALUE, this will overflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};