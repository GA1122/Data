class badSink_class{
    public void badSink() throws Throwable
        {
            String data = CWE690_NULL_Deref_From_Return__System_getProperty_equals_68a.data;
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};