class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data = (new CWE191_Integer_Underflow__long_min_multiply_61b()).goodG2BSource();
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Long.MIN_VALUE, this will underflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};