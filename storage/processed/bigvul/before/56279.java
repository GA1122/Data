class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            CWE369_Divide_by_Zero__int_random_modulo_81_base baseObject = new CWE369_Divide_by_Zero__int_random_modulo_81_bad();
            baseObject.action(data );
        }
};