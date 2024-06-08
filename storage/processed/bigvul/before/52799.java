class bad_class{
    public void bad() throws Throwable
        {
            float data = 0.0f;
    
            /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
            SecureRandom secureRandom = new SecureRandom();
            data = secureRandom.nextFloat();
    
            badPublicStatic = true;
            (new CWE369_Divide_by_Zero__float_random_divide_22b()).badSink(data );
        }
};