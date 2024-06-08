class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            float data = goodB2GSource();
    
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
};