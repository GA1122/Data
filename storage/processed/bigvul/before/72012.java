class goodG2BSink_class{
    public void goodG2BSink(CWE690_NULL_Deref_From_Return__System_getProperty_equals_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            /* POTENTIAL FLAW: data could be null */
            if(data.equals("CWE690"))
            {
                IO.writeLine("data is CWE690");
            }
    
        }
};