class goodB2G1Sink_class{
    public void goodB2G1Sink(float data ) throws Throwable
        {
            if (CWE369_Divide_by_Zero__float_PropertiesFile_modulo_22a.goodB2G1PublicStatic)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0.0f;
            }
            else
            {
    
                /* FIX: Check for value of or near zero before modulo */
                if (Math.abs(data) > 0.000001)
                {
                    int result = (int)(100.0 % data);
                    IO.writeLine(result);
                }
                else
                {
                    IO.writeLine("This would result in a modulo by zero");
                }
    
            }
        }
};