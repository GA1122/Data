class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            goodB2G2Private = true;
            goodB2G2Sink(count );
        }
};