class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            int data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MAX_VALUE;
            }
            else
            {
    
                /* POTENTIAL FLAW: Use the maximum value for this type */
                data = Integer.MAX_VALUE;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
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
            else
            {
    
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
        }
};