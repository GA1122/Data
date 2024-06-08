class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
            SecureRandom secureRandom = new SecureRandom();
            data = secureRandom.nextFloat();
    
            (new CWE369_Divide_by_Zero__float_random_divide_51b()).badSink(data  );
        }
};