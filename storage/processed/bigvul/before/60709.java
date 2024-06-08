class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            int count = 0;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            goodB2G2PublicStatic = true;
            (new CWE400_Resource_Exhaustion__max_value_for_loop_22b()).goodB2G2Sink(count );
        }
};