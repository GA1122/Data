class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: call getStringGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE690_NULL_Deref_From_Return__Class_String_67b()).goodG2BSink(dataContainer  );
        }
};