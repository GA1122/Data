class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int count;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            count = 2;
    
            int[] countArray = new int[5];
            countArray[2] = count;
            (new CWE400_Resource_Exhaustion__PropertiesFile_for_loop_66b()).goodG2BSink(countArray  );
        }
};