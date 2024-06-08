class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            /* POTENTIAL FLAW: data may be set to null */
            data = System.getProperty("CWE690");
    
            String[] dataArray = new String[5];
            dataArray[2] = data;
            (new CWE690_NULL_Deref_From_Return__System_getProperty_trim_66b()).badSink(dataArray  );
        }
};