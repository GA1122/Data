class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            HashMap<Integer,Long> dataHashMap = new HashMap<Integer,Long>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE190_Integer_Overflow__long_max_multiply_74b()).goodG2BSink(dataHashMap  );
        }
};