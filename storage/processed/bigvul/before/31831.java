class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};