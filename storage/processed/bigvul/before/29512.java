class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            short data = 0;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            goodB2G1PublicStatic = false;
            (new CWE190_Integer_Overflow__short_rand_multiply_22b()).goodB2G1Sink(data );
        }
};