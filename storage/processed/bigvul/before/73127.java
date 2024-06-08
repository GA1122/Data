class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            badPublicStatic = true;
            data = (new CWE789_Uncontrolled_Mem_Alloc__Environment_HashMap_22b()).badSource();
    
            /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
            HashMap intHashMap = new HashMap(data);
    
        }
};