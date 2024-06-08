class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Short.MAX_VALUE;
    
            for (int j = 0; j < 1; j++)
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Short.MAX_VALUE, this will overflow */
                    short result = (short)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};