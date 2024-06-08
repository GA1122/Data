class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            byte[] dataArray = new byte[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__byte_rand_square_66b()).goodG2BSink(dataArray  );
        }
};