class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int data = 0;
    
            /* POTENTIAL FLAW: Set data to a random value */
            data = (new SecureRandom()).nextInt();
    
            goodB2G2PublicStatic = true;
            (new CWE369_Divide_by_Zero__int_random_modulo_22b()).goodB2G2Sink(data );
        }
};