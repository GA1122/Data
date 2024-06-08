class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MAX_VALUE;
            }
            else
            {
    
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Short.MAX_VALUE;
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Add a check to prevent an overflow from occurring */
                /* NOTE: Math.abs of the minimum int or long will return that same value, so we must check for it */
                if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long)Math.sqrt(Short.MAX_VALUE)))
                {
                    short result = (short)(data * data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform squaring.");
                }
            }
            else
            {
    
                /* FIX: Add a check to prevent an overflow from occurring */
                /* NOTE: Math.abs of the minimum int or long will return that same value, so we must check for it */
                if ((data != Integer.MIN_VALUE) && (data != Long.MIN_VALUE) && (Math.abs(data) <= (long)Math.sqrt(Short.MAX_VALUE)))
                {
                    short result = (short)(data * data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too large to perform squaring.");
                }
    
            }
        }
};