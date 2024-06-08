class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data = (new CWE190_Integer_Overflow__int_max_multiply_61b()).goodG2BSource();
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Integer.MAX_VALUE, this will overflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};