class goodB2GSink_class{
    public void goodB2GSink(CWE690_NULL_Deref_From_Return__Properties_getProperty_trim_67a.Container dataContainer ) throws Throwable
        {
            String data = dataContainer.containerOne;
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};