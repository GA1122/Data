class goodB2G2Sink_class{
    public void goodB2G2Sink(String data ) throws Throwable
        {
            if (CWE690_NULL_Deref_From_Return__System_getProperty_equals_22a.goodB2G2PublicStatic)
            {
                /* FIX: call equals() on string literal (that is not null) */
                if("CWE690".equals(data))
                {
                    IO.writeLine("data is CWE690");
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