class goodB2GSink_class{
    public void goodB2GSink() throws Throwable
        {
            StringBuilder data = CWE690_NULL_Deref_From_Return__Class_StringBuilder_68a.data;
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};