class goodB2G1_class{
    private void goodB2G1() throws Throwable
        {
            String data;
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: Call getStringBad(), which may return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBad();
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (privateFive!=5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.trim();
                    IO.writeLine(stringTrimmed);
                }
    
            }
        }
};