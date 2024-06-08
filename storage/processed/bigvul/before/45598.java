class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            /* FLAW: Use a number larger than Byte.MAX_VALUE */
            data = Byte.MAX_VALUE + 5;
    
            for (int i = 0; i < 1; i++)
            {
                {
                    /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                    IO.writeLine((byte)data);
                }
            }
        }
};