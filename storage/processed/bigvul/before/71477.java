class bad_class{
    public void bad() throws Throwable
        {
            String data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Call getStringBad(), which may return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
                break;
            }
    
            while (true)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
                break;
            }
        }
};