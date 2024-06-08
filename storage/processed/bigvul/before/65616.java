class goodB2G1Sink_class{
    public void goodB2G1Sink(String data ) throws Throwable
        {
            if (CWE476_NULL_Pointer_Dereference__String_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = null;
            }
            else
            {
    
                /* FIX: validate that data is non-null */
                if (data != null)
                {
                    IO.writeLine("" + data.length());
                }
                else
                {
                    IO.writeLine("data is null");
                }
    
            }
        }
};