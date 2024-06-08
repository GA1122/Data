class badSink_class{
    public void badSink() throws Throwable
        {
            short data = CWE190_Integer_Overflow__short_max_multiply_68a.data;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Short.MAX_VALUE, this will overflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};