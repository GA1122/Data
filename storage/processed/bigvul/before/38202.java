class goodB2GSink_class{
    public void goodB2GSink(Vector<Integer> dataVector ) throws Throwable
        {
            int data = dataVector.remove(2);
    
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