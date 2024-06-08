class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
            if (PRIVATE_STATIC_FINAL_FIVE==5)
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
    
            if (PRIVATE_STATIC_FINAL_FIVE==5)
            {
                /* POTENTIAL FLAW: data could be null */
                if(data.equals("CWE690"))
                {
                    IO.writeLine("data is CWE690");
                }
            }
        }
};