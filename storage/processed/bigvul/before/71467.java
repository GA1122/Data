class bad_class{
    public void bad() throws Throwable
        {
            String data;
            if (IO.staticFive==5)
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
    
            if (IO.staticFive==5)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
        }
};