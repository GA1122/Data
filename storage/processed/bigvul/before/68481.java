class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* get environment variable ADD */
            /* POTENTIAL FLAW: Read data from an environment variable */
            data = System.getenv("ADD");
    
            HashMap<Integer,String> dataHashMap = new HashMap<Integer,String>();
            dataHashMap.put(0, data);
            dataHashMap.put(1, data);
            dataHashMap.put(2, data);
            (new CWE606_Unchecked_Loop_Condition__Environment_74b()).goodB2GSink(dataHashMap  );
        }
};