class bad_class{
    public void bad() throws Throwable
        {
            long data = (new CWE190_Integer_Overflow__long_max_multiply_61b()).badSource();
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};