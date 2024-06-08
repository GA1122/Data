class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder dataCopy;
            {
                StringBuilder data;
    
                /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
                dataCopy = data;
            }
            {
                StringBuilder data = dataCopy;
    
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
    
                IO.writeLine(stringTrimmed);
    
            }
        }
};