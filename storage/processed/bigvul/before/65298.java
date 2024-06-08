class goodB2G2Sink_class{
    public void goodB2G2Sink(int [] data ) throws Throwable
        {
            if (CWE476_NULL_Pointer_Dereference__int_array_22a.goodB2G2PublicStatic)
            {
                /* FIX: validate that data is non-null */
                if (data != null)
                {
                    IO.writeLine("" + data.length);
                }
                else
                {
                    IO.writeLine("data is null");
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