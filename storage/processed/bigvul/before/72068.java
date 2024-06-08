class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
            if (privateTrue)
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
    
            if (privateTrue)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
        }
};