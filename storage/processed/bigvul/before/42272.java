class goodG2BSink_class{
    public void goodG2BSink(CWE191_Integer_Underflow__short_rand_multiply_67a.Container dataContainer ) throws Throwable
        {
            short data = dataContainer.containerOne;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Short.MIN_VALUE, this will underflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};