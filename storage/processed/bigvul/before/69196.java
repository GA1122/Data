class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded int as a string */
            data = "5";
    
            Vector<String> dataVector = new Vector<String>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE606_Unchecked_Loop_Condition__Property_72b()).goodG2BSink(dataVector  );
        }
};