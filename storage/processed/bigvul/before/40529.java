class bad_class{
    public void bad() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            badPublicStatic = true;
            (new CWE191_Integer_Underflow__long_rand_postdec_22b()).badSink(data );
        }
};