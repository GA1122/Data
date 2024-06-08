class badSink_class{
    public void badSink(String data ) throws Throwable
        {
            if (CWE690_NULL_Deref_From_Return__Properties_getProperty_equals_22a.badPublicStatic)
            {
                /* POTENTIAL FLAW: data could be null */
                if(data.equals("CWE690"))
                {
                    IO.writeLine("data is CWE690");
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
        }
};