class bad_class{
    public void bad() throws Throwable
        {
            long data = 0L;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            badPublicStatic = true;
            (new CWE190_Integer_Overflow__long_rand_square_22b()).badSink(data );
        }
};