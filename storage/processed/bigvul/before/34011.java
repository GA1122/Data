class badSink_class{
    public void badSink() throws Throwable
        {
            int data = CWE191_Integer_Underflow__int_Environment_multiply_68a.data;
    
            if(data < 0) /* ensure we won't have an overflow */
            {
                /* POTENTIAL FLAW: if (data * 2) < Integer.MIN_VALUE, this will underflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};