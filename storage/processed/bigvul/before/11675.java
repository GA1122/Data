class goodB2G2Sink_class{
    public void goodB2G2Sink(String data ) throws Throwable
        {
            if (CWE134_Uncontrolled_Format_String__File_format_22a.goodB2G2PublicStatic)
            {
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.format("%s%n", data);
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