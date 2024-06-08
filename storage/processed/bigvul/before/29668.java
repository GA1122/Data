class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Use a random value */
            data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: if data == Short.MAX_VALUE, this will overflow */
                data++;
                short result = (short)(data);
                IO.writeLine("result: " + result);
            }
        }
};