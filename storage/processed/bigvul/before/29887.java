class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            CWE190_Integer_Overflow__short_rand_preinc_81_base baseObject = new CWE190_Integer_Overflow__short_rand_preinc_81_bad();
            baseObject.action(data );
        }
};