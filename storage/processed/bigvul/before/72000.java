class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            String data = (new CWE690_NULL_Deref_From_Return__System_getProperty_equals_61b()).goodG2BSource();
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};