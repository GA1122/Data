class badSink_class{
    public void badSink(CWE190_Integer_Overflow__byte_rand_multiply_67a.Container dataContainer ) throws Throwable
        {
            byte data = dataContainer.containerOne;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};