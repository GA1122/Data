class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            StringBuilder data;
    
            /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
            data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
    
            for (int k = 0; k < 1; k++)
            {
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.toString().trim();
                    IO.writeLine(stringTrimmed);
                }
            }
        }
};