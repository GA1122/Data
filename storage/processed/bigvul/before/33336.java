class bad_class{
    public void bad() throws Throwable
        {
            int data = (new CWE191_Integer_Underflow__int_database_multiply_61b()).badSource();
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};