class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            int[] dataArray = new int[5];
            dataArray[2] = data;
            (new CWE190_Integer_Overflow__int_File_preinc_66b()).goodG2BSink(dataArray  );
        }
};