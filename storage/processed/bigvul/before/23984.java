class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            goodB2G1PublicStatic = false;
            (new CWE190_Integer_Overflow__int_random_add_22b()).goodB2G1Sink(data );
        }
};