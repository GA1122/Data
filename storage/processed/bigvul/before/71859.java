class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Set data to a fixed, non-null String */
            data = "CWE690";
    
            Vector<String> dataVector = new Vector<String>(5);
            dataVector.add(0, data);
            dataVector.add(1, data);
            dataVector.add(2, data);
            (new CWE690_NULL_Deref_From_Return__Properties_getProperty_trim_72b()).goodG2BSink(dataVector  );
        }
};