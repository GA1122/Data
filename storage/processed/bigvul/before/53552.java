class goodB2GSink_class{
    public void goodB2GSink(CWE369_Divide_by_Zero__float_zero_modulo_67a.Container dataContainer ) throws Throwable
        {
            float data = dataContainer.containerOne;
    
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