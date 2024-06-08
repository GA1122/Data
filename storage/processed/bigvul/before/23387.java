class badSink_class{
    public void badSink() throws Throwable
        {
            int data = CWE190_Integer_Overflow__int_Property_multiply_68a.data;
    
            if(data > 0) /* ensure we won't have an underflow */
            {
                /* POTENTIAL FLAW: if (data*2) > Integer.MAX_VALUE, this will overflow */
                int result = (int)(data * 2);
                IO.writeLine("result: " + result);
            }
    
        }
};