class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE36_Absolute_Path_Traversal__Environment_66b()).goodG2BSink(dataArray  );
        }
};