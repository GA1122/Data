class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            short data = 0;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            goodB2G2PublicStatic = true;
            (new CWE190_Integer_Overflow__short_rand_preinc_22b()).goodB2G2Sink(data );
        }
};