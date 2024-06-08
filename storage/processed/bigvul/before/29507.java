class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};