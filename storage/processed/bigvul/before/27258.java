class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data = (new CWE190_Integer_Overflow__long_rand_multiply_61b()).goodG2BSource();
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};