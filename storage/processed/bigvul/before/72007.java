class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            Container dataContainer = new Container();
            dataContainer.containerOne = data;
            (new CWE690_NULL_Deref_From_Return__System_getProperty_equals_67b()).badSink(dataContainer  );
        }
};