class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            goodB2G1PublicStatic = false;
            (new CWE191_Integer_Underflow__long_rand_multiply_22b()).goodB2G1Sink(data );
        }
};