class goodB2G_class{
    private void goodB2G() throws Throwable
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
    
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.trim();
                    IO.writeLine(stringTrimmed);
                }
    
            }
        }
};