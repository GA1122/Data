class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            goodB2G2PublicStatic = true;
            (new CWE190_Integer_Overflow__long_rand_square_22b()).goodB2G2Sink(data );
        }
};