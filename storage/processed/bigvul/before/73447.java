class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            badPublicStatic = true;
            data = (new CWE789_Uncontrolled_Mem_Alloc__File_HashSet_22b()).badSource();
    
            /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
            HashSet intHashSet = new HashSet(data);
    
        }
};