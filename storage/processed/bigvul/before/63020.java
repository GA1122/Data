class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            int count = 0;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            goodB2G1PublicStatic = false;
            (new CWE400_Resource_Exhaustion__sleep_max_value_22b()).goodB2G1Sink(count );
        }
};