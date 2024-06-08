class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            goodB2G1Private = false;
            goodB2G1Sink(count );
        }
};