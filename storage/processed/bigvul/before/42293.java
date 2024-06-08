class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            short data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            HashMap<Integer,Short> dataHashMap = new HashMap<Integer,Short>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE191_Integer_Underflow__short_rand_multiply_74b()).goodG2BSink(dataHashMap  );
        }
};