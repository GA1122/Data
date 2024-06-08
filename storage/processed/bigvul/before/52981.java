class bad_class{
    public void bad() throws Throwable
        {
            float data;
    
            /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
            SecureRandom secureRandom = new SecureRandom();
            data = secureRandom.nextFloat();
    
            float[] dataArray = new float[5];
            dataArray[2] = data;
            (new CWE369_Divide_by_Zero__float_random_modulo_66b()).badSink(dataArray  );
        }
};