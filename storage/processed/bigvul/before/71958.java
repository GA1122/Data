class goodB2G1Sink_class{
    private void goodB2G1Sink(String data ) throws Throwable
        {
            if (goodB2G1Private)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: call equals() on string literal (that is not null) */
                if("CWE690".equals(data))
                {
                    IO.writeLine("data is CWE690");
                }
    
            }
        }
};