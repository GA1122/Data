class goodB2GSink_class{
    public void goodB2GSink(CWE690_NULL_Deref_From_Return__Class_StringBuilder_67a.Container dataContainer ) throws Throwable
        {
            StringBuilder data = dataContainer.containerOne;
    
            /* FIX: explicit check for null */
            if (data != null)
            {
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
    
        }
};