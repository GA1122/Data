class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            CWE400_Resource_Exhaustion__sleep_max_value_81_base baseObject = new CWE400_Resource_Exhaustion__sleep_max_value_81_goodB2G();
            baseObject.action(count );
        }
};