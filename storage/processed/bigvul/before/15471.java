class badSink_class{
    public void badSink() throws Throwable
        {
            byte data = CWE190_Integer_Overflow__byte_max_multiply_68a.data;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};