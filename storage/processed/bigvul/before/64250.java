class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded class name */
            data = "Testing.test";
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE470_Unsafe_Reflection__console_readLine_67b()).goodG2BSink(dataContainer  );
        }
};