class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded int as a string */
            data = "5";
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE606_Unchecked_Loop_Condition__File_66b()).goodG2BSink(dataArray  );
        }
};