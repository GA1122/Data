class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded class name */
            data = "Testing.test";
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE470_Unsafe_Reflection__File_66b()).goodG2BSink(dataArray  );
        }
};