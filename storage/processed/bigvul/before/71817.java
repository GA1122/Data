class goodB2G2Sink_class{
    public void goodB2G2Sink(String data ) throws Throwable
        {
            if (CWE690_NULL_Deref_From_Return__Properties_getProperty_trim_22a.goodB2G2PublicStatic)
            {
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.trim();
                    IO.writeLine(stringTrimmed);
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
        }
};