class bad_class{
    public void bad() throws Throwable
        {
            byte data;
    
            /* POTENTIAL FLAW: Use a random value */
            data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
    
            CWE191_Integer_Underflow__byte_rand_sub_81_base baseObject = new CWE191_Integer_Underflow__byte_rand_sub_81_bad();
            baseObject.action(data );
        }
};