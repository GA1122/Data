class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            StringBuilder data;
            if (true)
            {
                /* FIX: call getStringBuilderGood(), which will never return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderGood();
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if (true)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
        }
};