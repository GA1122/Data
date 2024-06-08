class goodB2GSink_class{
    private void goodB2GSink() throws Throwable
        {
            int data = dataGoodB2G;
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Integer.MIN_VALUE)
            {
                int result = (int)(--data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};