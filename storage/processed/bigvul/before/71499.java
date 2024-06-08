class bad_class{
    public void bad() throws Throwable
        {
            String dataCopy;
            {
                String data;
    
                /* POTENTIAL FLAW: Call getStringBad(), which may return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
    
                dataCopy = data;
            }
            {
                String data = dataCopy;
    
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
    
                IO.writeLine(stringTrimmed);
    
            }
        }
};