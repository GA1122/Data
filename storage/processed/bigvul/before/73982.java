class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            CWE789_Uncontrolled_Mem_Alloc__max_value_HashSet_81_base baseObject = new CWE789_Uncontrolled_Mem_Alloc__max_value_HashSet_81_goodG2B();
            baseObject.action(data );
        }
};