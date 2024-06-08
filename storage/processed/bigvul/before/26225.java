class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            long data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            long[] dataArray = new long[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__long_console_readLine_square_66b()).goodG2BSink(dataArray  );
        }
};