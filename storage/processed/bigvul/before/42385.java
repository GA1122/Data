class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};