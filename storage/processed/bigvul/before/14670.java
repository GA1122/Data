class bad_class{
    public void bad() throws Throwable
        {
            byte data = (new CWE190_Integer_Overflow__byte_console_readLine_multiply_61b()).badSource();
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};