class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            byte data = 0;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            goodB2G2PublicStatic = true;
            (new CWE191_Integer_Underflow__byte_rand_postdec_22b()).goodB2G2Sink(data );
        }
};