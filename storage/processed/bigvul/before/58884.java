class goodB2G2Sink_class{
    private void goodB2G2Sink(int count ) throws Throwable
        {
            if (goodB2G2Private)
            {
                int i = 0;
                /* FIX: Validate count before using it as the for loop variant */
                if (count > 0 && count <= 20)
                {
                    for (i = 0; i < count; i++)
                    {
                        IO.writeLine("Hello");
                    }
                }
            }
        }
};