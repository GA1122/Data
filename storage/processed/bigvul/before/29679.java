class bad_class{
    public void bad() throws Throwable
        {
            short data = 0;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            badPublicStatic = true;
            (new CWE190_Integer_Overflow__short_rand_postinc_22b()).badSink(data );
        }
};