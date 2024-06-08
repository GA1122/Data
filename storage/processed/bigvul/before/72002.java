class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE690_NULL_Deref_From_Return__System_getProperty_equals_66b()).goodB2GSink(dataArray  );
        }
};