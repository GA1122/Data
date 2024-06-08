class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
                break;
            }
        }
};