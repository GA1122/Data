class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            goodB2G2Private = true;
            goodB2G2Sink(data );
        }
};