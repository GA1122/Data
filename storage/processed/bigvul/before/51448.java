class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            float data = dataGoodB2G;
    
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
};