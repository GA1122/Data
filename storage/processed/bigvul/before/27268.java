class badSink_class{
    public void badSink(CWE190_Integer_Overflow__long_rand_multiply_67a.Container dataContainer ) throws Throwable
        {
            long data = dataContainer.containerOne;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};