class bad_class{
    public void bad() throws Throwable
        {
            int count = 0;
    
            /* POTENTIAL FLAW: Set count to Integer.MAX_VALUE */
            count = Integer.MAX_VALUE;
    
            badPublicStatic = true;
            (new CWE400_Resource_Exhaustion__max_value_for_loop_22b()).badSink(count );
        }
};