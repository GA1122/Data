class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int count = 0;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            goodB2G1PublicStatic = false;
            (new CWE400_Resource_Exhaustion__random_write_22b()).goodB2G1Sink(count );
        }
};