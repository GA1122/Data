class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            CWE190_Integer_Overflow__int_random_square_81_base baseObject = new CWE190_Integer_Overflow__int_random_square_81_bad();
            baseObject.action(data );
        }
};