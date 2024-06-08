class goodB2GSink_class{
    public void goodB2GSink(int dataArray[] ) throws Throwable
        {
            int data = dataArray[2];
    
            /* FIX: Add a check to prevent an overflow from occurring */
            if (data < Integer.MAX_VALUE)
            {
                int result = (int)(data + 1);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too large to perform addition.");
            }
    
        }
};