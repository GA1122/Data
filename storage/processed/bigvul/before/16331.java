class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            byte data = 0;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            goodB2G2PublicStatic = true;
            (new CWE190_Integer_Overflow__byte_rand_postinc_22b()).goodB2G2Sink(data );
        }
};