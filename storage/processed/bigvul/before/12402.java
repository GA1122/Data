class goodB2G1Sink_class{
    public void goodB2G1Sink(String data ) throws Throwable
        {
            if (CWE134_Uncontrolled_Format_String__PropertiesFile_format_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
            else
            {
    
                if (data != null)
                {
                    /* FIX: explicitly defined string formatting */
                    System.out.format("%s%n", data);
                }
    
            }
        }
};