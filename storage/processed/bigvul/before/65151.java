class goodB2G2Sink_class{
    private void goodB2G2Sink(Integer data ) throws Throwable
        {
            if (goodB2G2Private)
            {
                /* FIX: validate that data is non-null */
                if (data != null)
                {
                    IO.writeLine("" + data.toString());
                }
                else
                {
                    IO.writeLine("data is null");
                }
            }
        }
};