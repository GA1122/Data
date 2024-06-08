class goodB2G2Sink_class{
    private void goodB2G2Sink(int count ) throws Throwable
        {
            if (goodB2G2Private)
            {
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
                }
            }
        }
};