class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            String data = (new CWE690_NULL_Deref_From_Return__System_getProperty_trim_61b()).goodB2GSource();
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};