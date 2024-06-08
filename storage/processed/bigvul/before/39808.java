class goodG2BSink_class{
    public void goodG2BSink(CWE191_Integer_Underflow__long_min_multiply_67a.Container dataContainer ) throws Throwable
        {
            long data = dataContainer.containerOne;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Long.MIN_VALUE, this will underflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};