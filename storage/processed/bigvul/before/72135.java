class badSink_class{
    public void badSink(String data ) throws Throwable
        {
            if (CWE690_NULL_Deref_From_Return__System_getProperty_trim_22a.badPublicStatic)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.trim();
                IO.writeLine(stringTrimmed);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
        }
};