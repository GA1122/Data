class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: if (data*data) > Long.MAX_VALUE, this will overflow */
                long result = (long)(data * data);
                IO.writeLine("result: " + result);
            }
        }
};