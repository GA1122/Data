class goodG2BSink_class{
    public void goodG2BSink() throws Throwable
        {
            long data = CWE190_Integer_Overflow__long_rand_multiply_68a.data;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};