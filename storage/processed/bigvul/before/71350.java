class goodB2G2Sink_class{
    private void goodB2G2Sink(StringBuilder data ) throws Throwable
        {
            if (goodB2G2Private)
            {
                /* FIX: explicit check for null */
                if (data != null)
                {
                    String stringTrimmed = data.toString().trim();
                    IO.writeLine(stringTrimmed);
                }
            }
        }
};