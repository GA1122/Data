class bad_class{
    public void bad() throws Throwable
        {
            byte data;
            if (IO.staticTrue)
            {
                /* POTENTIAL FLAW: Use a random value */
                data = (byte)((new java.security.SecureRandom()).nextInt(1+Byte.MAX_VALUE-Byte.MIN_VALUE) + Byte.MIN_VALUE);
            }
            else
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run
                 * but ensure data is inititialized before the Sink to avoid compiler errors */
                data = 0;
            }
    
            if (IO.staticTrue)
            {
                /* POTENTIAL FLAW: if data == Byte.MAX_VALUE, this will overflow */
                byte result = (byte)(data + 1);
                IO.writeLine("result: " + result);
            }
        }
};