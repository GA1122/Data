class goodB2G1Sink_class{
    public void goodB2G1Sink(String data ) throws Throwable
        {
            if (CWE690_NULL_Deref_From_Return__Properties_getProperty_equals_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
            else
            {
    
                /* FIX: call equals() on string literal (that is not null) */
                if("CWE690".equals(data))
                {
                    IO.writeLine("data is CWE690");
                }
    
            }
        }
};