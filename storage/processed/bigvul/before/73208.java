class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            int data;
    
            goodG2B1PublicStatic = false;
            data = (new CWE789_Uncontrolled_Mem_Alloc__Environment_HashSet_22b()).goodG2B1Source();
    
            /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
            HashSet intHashSet = new HashSet(data);
    
        }
};