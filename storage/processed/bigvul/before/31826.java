class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* We need to have one source outside of a for loop in order
             * to prevent the Java compiler from generating an error because
             * data is uninitialized
             */
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            for (int j = 0; j < 1; j++)
            {
                /* POTENTIAL FLAW: if data == Byte.MIN_VALUE, this will overflow */
                byte result = (byte)(data - 1);
                IO.writeLine("result: " + result);
            }
        }
};