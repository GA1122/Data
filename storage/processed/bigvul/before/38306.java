class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            goodB2G1PublicStatic = false;
            (new CWE191_Integer_Underflow__int_random_sub_22b()).goodB2G1Sink(data );
        }
};