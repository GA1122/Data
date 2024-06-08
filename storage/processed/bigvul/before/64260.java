class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded class name */
            data = "Testing.test";
    
            Vector<String> dataVector = new Vector<String>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE470_Unsafe_Reflection__console_readLine_72b()).goodG2BSink(dataVector  );
        }
};