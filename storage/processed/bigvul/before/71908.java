class goodB2G2_class{
    private void goodB2G2() throws Throwable
        {
            String data;
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: data may be set to null */
                data = System.getProperty("CWE690");
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (privateFive==5)
            {
                /* FIX: call equals() on string literal (that is not null) */
                if("CWE690".equals(data))
                {
                    IO.writeLine("data is CWE690");
                }
            }
        }
};