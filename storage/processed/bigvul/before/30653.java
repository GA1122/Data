class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            byte data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            byte[] dataArray = new byte[5];
            dataArray[2] = data;
            (new CWE191_Integer_Underflow__byte_console_readLine_sub_66b()).goodG2BSink(dataArray  );
        }
};