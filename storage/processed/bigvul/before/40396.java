class bad_class{
    public void bad() throws Throwable
        {
            long data = (new CWE191_Integer_Underflow__long_rand_multiply_61b()).badSource();
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Long.MIN_VALUE, this will underflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};