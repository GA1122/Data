class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int count = 0;
    
            /* POTENTIAL FLAW: Set count to a random value */
            count = (new SecureRandom()).nextInt();
    
            goodB2G2PublicStatic = true;
            (new CWE400_Resource_Exhaustion__random_write_22b()).goodB2G2Sink(count );
        }
};