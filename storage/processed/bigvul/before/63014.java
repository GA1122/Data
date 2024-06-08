class goodB2G1Sink_class{
    private void goodB2G1Sink(int count ) throws Throwable
        {
            if (goodB2G1Private)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                /* FIX: Validate count before using it in a call to Thread.sleep() */
                if (count > 0 && count <= 2000)
                {
                    Thread.sleep(count);
                }
    
            }
        }
};