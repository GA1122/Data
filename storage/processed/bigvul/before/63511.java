class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            CWE400_Resource_Exhaustion__sleep_random_81_base baseObject = new CWE400_Resource_Exhaustion__sleep_random_81_bad();
            baseObject.action(count );
        }
};