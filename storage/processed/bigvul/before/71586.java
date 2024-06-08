class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
            if (IO.STATIC_FINAL_TRUE)
            {
                /* FIX: Set data to a fixed, non-null String */
                data = "CWE690";
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.STATIC_FINAL_TRUE)
            {
                /* POTENTIAL FLAW: data could be null */
                if(data.equals("CWE690"))
                {
                    IO.writeLine("data is CWE690");
                }
            }
        }
};