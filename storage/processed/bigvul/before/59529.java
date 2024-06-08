class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int count;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            count = 2;
    
            CWE400_Resource_Exhaustion__database_write_81_base baseObject = new CWE400_Resource_Exhaustion__database_write_81_goodG2B();
            baseObject.action(count );
        }
};