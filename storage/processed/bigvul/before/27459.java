class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            CWE190_Integer_Overflow__long_rand_postinc_81_base baseObject = new CWE190_Integer_Overflow__long_rand_postinc_81_bad();
            baseObject.action(data );
        }
};