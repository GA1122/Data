class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Set data to Integer.MAX_VALUE */
            data = Integer.MAX_VALUE;
    
            CWE789_Uncontrolled_Mem_Alloc__max_value_ArrayList_81_base baseObject = new CWE789_Uncontrolled_Mem_Alloc__max_value_ArrayList_81_bad();
            baseObject.action(data );
        }
};