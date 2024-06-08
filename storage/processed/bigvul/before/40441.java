class bad_class{
    public void bad() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            CWE191_Integer_Underflow__long_rand_multiply_81_base baseObject = new CWE191_Integer_Underflow__long_rand_multiply_81_bad();
            baseObject.action(data );
        }
};