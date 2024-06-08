class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            int data;
    
            goodG2B2PublicStatic = true;
            data = (new CWE789_Uncontrolled_Mem_Alloc__max_value_HashSet_22b()).goodG2B2Source();
    
            /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
            HashSet intHashSet = new HashSet(data);
    
        }
};