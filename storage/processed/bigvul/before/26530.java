class goodG2BSink_class{
    public void goodG2BSink(CWE190_Integer_Overflow__long_max_multiply_67a.Container dataContainer ) throws Throwable
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