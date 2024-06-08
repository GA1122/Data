class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data;
    
            /* FIX: call getStringGood(), which will never return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
    
            CWE690_NULL_Deref_From_Return__Class_String_81_base baseObject = new CWE690_NULL_Deref_From_Return__Class_String_81_goodG2B();
            baseObject.action(data );
        }
};