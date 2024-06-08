class bad_class{
    public void bad() throws Throwable
        {
            int count;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            CWE400_Resource_Exhaustion__max_value_for_loop_81_base baseObject = new CWE400_Resource_Exhaustion__max_value_for_loop_81_bad();
            baseObject.action(count );
        }
};