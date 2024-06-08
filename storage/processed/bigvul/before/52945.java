class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            float data;
    
            /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
            SecureRandom secureRandom = new SecureRandom();
            data = secureRandom.nextFloat();
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};