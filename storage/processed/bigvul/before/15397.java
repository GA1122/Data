class bad_class{
    public void bad() throws Throwable
        {
            byte data;
            if (IO.staticFive==5)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Byte.MAX_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (IO.staticFive==5)
            {
                if(data > 0) /* ensure we won't have an underflow */
                {
                    /* POTENTIAL FLAW: if (data*2) > Byte.MAX_VALUE, this will overflow */
                    byte result = (byte)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};