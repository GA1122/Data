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
                /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
                short result = (short)(data + 1);
                IO.writeLine("result: " + result);
            }
        }
};