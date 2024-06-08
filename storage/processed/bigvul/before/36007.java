class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            /* POTENTIAL FLAW: Use the maximum value for this type */
            data = Integer.MIN_VALUE;
    
            /* FIX: Add a check to prevent an underflow from occurring */
            if (data > Integer.MIN_VALUE)
            {
                data--;
                int result = (int)(data);
                IO.writeLine("result: " + result);
            }
            else
            {
                IO.writeLine("data value is too small to decrement.");
            }
    
        }
};