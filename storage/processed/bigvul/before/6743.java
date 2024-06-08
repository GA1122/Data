class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE129_Improper_Validation_of_Array_Index__PropertiesFile_array_read_check_max_67b()).goodG2BSink(dataContainer  );
        }
};