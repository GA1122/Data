class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            String data = CWE690_NULL_Deref_From_Return__System_getProperty_trim_68a.data;
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};