class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            StringBuilder data = (new CWE690_NULL_Deref_From_Return__Class_StringBuilder_61b()).goodB2GSource();
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};