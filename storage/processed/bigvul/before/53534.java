class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            float dataCopy;
            {
                float data;
    
                data = 0.0f; /* POTENTIAL FLAW: data is set to zero */
    
                dataCopy = data;
            }
            {
                float data = dataCopy;
    
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