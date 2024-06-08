class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data;
    
            /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
            data = 2;
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE197_Numeric_Truncation_Error__int_console_readLine_to_short_67b()).goodG2BSink(dataContainer  );
        }
};