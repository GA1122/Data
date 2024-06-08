class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: Use a hardcoded string */
            data = "foo";
    
            HashMap<Integer,String> dataHashMap = new HashMap<Integer,String>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE134_Uncontrolled_Format_String__Environment_printf_74b()).goodG2BSink(dataHashMap  );
        }
};