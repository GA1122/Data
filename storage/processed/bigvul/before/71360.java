class goodG2BSink_class{
    public void goodG2BSink(StringBuilder data ) throws Throwable
        {
            if (CWE690_NULL_Deref_From_Return__Class_StringBuilder_22a.goodG2BPublicStatic)
            {
                /* POTENTIAL FLAW: data could be null */
                String stringTrimmed = data.toString().trim();
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