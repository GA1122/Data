class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE690_NULL_Deref_From_Return__Class_String_66b()).goodB2GSink(dataArray  );
        }
};