class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            long data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (new java.security.SecureRandom()).nextLong();
    
            CWE190_Integer_Overflow__long_rand_add_81_base baseObject = new CWE190_Integer_Overflow__long_rand_add_81_goodB2G();
            baseObject.action(data );
        }
};