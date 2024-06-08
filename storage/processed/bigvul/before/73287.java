class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            badPublicStatic = true;
            data = (new CWE789_Uncontrolled_Mem_Alloc__File_ArrayList_22b()).badSource();
    
            /* POTENTIAL FLAW: Create an ArrayList using data as the initial size.  data may be very large, creating memory issues */
            ArrayList intArrayList = new ArrayList(data);
    
        }
};