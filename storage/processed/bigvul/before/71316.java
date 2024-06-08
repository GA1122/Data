class bad_class{
    public void bad() throws Throwable
        {
            StringBuilder data;
            if (IO.staticReturnsTrue())
            {
                /* POTENTIAL FLAW: Call getStringBuilderBad(), which may return null */
                data = CWE690_NULL_Deref_From_Return__Class_Helper.getStringBuilderBad();
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
    
            if(IO.staticReturnsTrue())
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
                IO.writeLine(stringTrimmed);
            }
        }
};