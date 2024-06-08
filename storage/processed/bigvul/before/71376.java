class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            StringBuilder[] dataArray = new StringBuilder[5];
            dataArray[2] = data;
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_66b()).goodB2GSink(dataArray  );
        }
};