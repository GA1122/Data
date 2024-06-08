class bad_class{
    public void bad() throws Throwable
        {
            byte data;
            if (privateFive==5)
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
    
            if (privateFive==5)
            {
                /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
                data++;
                byte result = (byte)(data);
                IO.writeLine("result: " + result);
            }
        }
};