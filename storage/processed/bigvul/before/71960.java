class goodB2G2Sink_class{
    private void goodB2G2Sink(String data ) throws Throwable
        {
            if (goodB2G2Private)
            {
                /* FIX: call equals() on string literal (that is not null) */
                if("CWE690".equals(data))
                {
                    IO.writeLine("data is CWE690");
                }
            }
        }
};