class goodB2G2Sink_class{
    public void goodB2G2Sink(float data ) throws Throwable
        {
            if (CWE369_Divide_by_Zero__float_File_divide_22a.goodB2G2PublicStatic)
            {
                /* FIX: Check for value of or near zero before dividing */
                if (Math.abs(data) > 0.000001)
                {
                    int result = (int)(100.0 / data);
                    IO.writeLine(result);
                }
                else
                {
                    IO.writeLine("This would result in a divide by zero");
                }
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0.0f;
            }
        }
};