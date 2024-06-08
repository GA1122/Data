class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Use the maximum size of the data type */
            data = Long.MAX_VALUE;
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: if data == Long.MAX_VALUE, this will overflow */
                long result = (long)(data + 1);
                IO.writeLine("result: " + result);
            }
        }
};