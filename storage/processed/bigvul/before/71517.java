class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: Call getStringBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE690_NULL_Deref_From_Return__Class_String_67b()).badSink(dataContainer  );
        }
};