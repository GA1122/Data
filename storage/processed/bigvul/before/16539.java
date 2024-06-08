class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            CWE190_Integer_Overflow__byte_rand_preinc_81_base baseObject = new CWE190_Integer_Overflow__byte_rand_preinc_81_goodG2B();
            baseObject.action(data );
        }
};