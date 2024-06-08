class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            CWE191_Integer_Underflow__int_random_predec_81_base baseObject = new CWE191_Integer_Underflow__int_random_predec_81_bad();
            baseObject.action(data );
        }
};