class bad_class{
    public void bad() throws Throwable
        {
            byte data;
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: Use the maximum size of the data type */
                data = Byte.MIN_VALUE;
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (privateFive==5)
            {
                if(data < 0) /* ensure we won't have an overflow */
                {
                    /* POTENTIAL FLAW: if (data * 2) < Byte.MIN_VALUE, this will underflow */
                    byte result = (byte)(data * 2);
                    IO.writeLine("result: " + result);
                }
            }
        }
};