class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};