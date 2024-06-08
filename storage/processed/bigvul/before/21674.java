class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MAX_VALUE;
    
            CWE190_Integer_Overflow__int_max_add_81_base baseObject = new CWE190_Integer_Overflow__int_max_add_81_goodB2G();
            baseObject.action(data );
        }
};