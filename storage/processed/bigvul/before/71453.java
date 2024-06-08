class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            String data;
            if (IO.staticTrue)
            {
                /* FIX: call getStringGood(), which will never return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringGood();
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (IO.staticTrue)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
        }
};