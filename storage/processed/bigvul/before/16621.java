class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};