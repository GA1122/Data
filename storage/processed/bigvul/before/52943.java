class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            float data;
    
            /* POTENTIAL FLAW: Set data to a random value between 0.0f (inclusive) and 1.0f (exclusive) */
            SecureRandom secureRandom = new SecureRandom();
            data = secureRandom.nextFloat();
    
            goodB2G1Private = false;
            goodB2G1Sink(data );
        }
};