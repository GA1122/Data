class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_67b()).badSink(dataContainer  );
        }
};