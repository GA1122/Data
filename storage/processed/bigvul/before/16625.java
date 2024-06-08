class bad_class{
    public void bad() throws Throwable
        {
            byte data = 0;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            badPublicStatic = true;
            (new CWE190_Integer_Overflow__byte_rand_square_22b()).badSink(data );
        }
};