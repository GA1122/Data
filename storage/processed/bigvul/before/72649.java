class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            int data;
    
            goodG2B2PublicStatic = true;
            data = (new CWE789_Uncontrolled_Mem_Alloc__console_readLine_HashMap_22b()).goodG2B2Source();
    
            /* POTENTIAL FLAW: Create a HashMap using data as the initial size.  data may be very large, creating memory issues */
            HashMap intHashMap = new HashMap(data);
    
        }
};