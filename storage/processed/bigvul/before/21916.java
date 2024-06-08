class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MAX_VALUE;
                break;
            }
    
            while (true)
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                if (data < Integer.MAX_VALUE)
                {
                    data++;
                    int result = (int)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to increment.");
                }
                break;
            }
        }
};