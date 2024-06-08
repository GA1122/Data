class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            CWE191_Integer_Underflow__long_rand_sub_81_base baseObject = new CWE191_Integer_Underflow__long_rand_sub_81_goodB2G();
            baseObject.action(data );
        }
};