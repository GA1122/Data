class goodB2GSink_class{
    public void goodB2GSink(HashMap<Integer,Float> dataHashMap ) throws Throwable
        {
            float data = dataHashMap.get(2);
    
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