class badSink_class{
    public void badSink(StringBuilder data ) throws Throwable
        {
            if (CWE476_NULL_Pointer_Dereference__StringBuilder_22a.badPublicStatic)
            {
                /* POTENTIAL FLAW: null dereference will occur if data is null */
                IO.writeLine("" + data.length());
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
        }
};