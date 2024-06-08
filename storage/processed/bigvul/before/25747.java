class badSink_class{
    public void badSink() throws Throwable
        {
            long data = CWE190_Integer_Overflow__long_console_readLine_multiply_68a.data;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};