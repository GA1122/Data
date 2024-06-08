class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            String data;
            if (privateFive!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
            else
            {
    
                /* FIX: Set data to a fixed, non-null String */
                data = "CWE690";
    
            }
    
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
        }
};