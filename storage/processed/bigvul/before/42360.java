class goodB2G_class{
    private void goodB2G() throws Throwable
        {
            short data;
            if(IO.staticReturnsTrueOrFalse())
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
            }
            else
            {
    
                /* POTENTIAL FLAW: Use a random value */
                data = (short)((new java.security.SecureRandom()).nextInt(1+Short.MAX_VALUE-Short.MIN_VALUE)+Short.MIN_VALUE);
    
            }
    
            if(IO.staticReturnsTrueOrFalse())
            {
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Short.MIN_VALUE)
                {
                    data--;
                    short result = (short)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
            }
            else
            {
    
                /* FIX: Add a check to prevent an underflow from occurring */
                if (data > Short.MIN_VALUE)
                {
                    data--;
                    short result = (short)(data);
                    IO.writeLine("result: " + result);
                }
                else
                {
                    IO.writeLine("data value is too small to decrement.");
                }
    
            }
        }
};