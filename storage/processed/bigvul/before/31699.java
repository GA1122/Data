class bad_class{
    public void bad() throws Throwable
        {
            byte data = 0;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            badPublicStatic = true;
            (new CWE191_Integer_Underflow__byte_rand_predec_22b()).badSink(data );
        }
};