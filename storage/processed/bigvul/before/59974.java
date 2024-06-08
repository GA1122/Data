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