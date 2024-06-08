class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short data = (new CWE190_Integer_Overflow__short_rand_multiply_61b()).goodG2BSource();
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Short.MAX_VALUE, this will overflow */
                short result = (short)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};