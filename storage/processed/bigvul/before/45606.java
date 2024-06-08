class bad_class{
    public void bad() throws Throwable
        {
            short dataCopy;
            {
                short data;
    
                /* FLAW: Use a number larger than Byte.MAX_VALUE */
                data = Byte.MAX_VALUE + 5;
    
                dataCopy = data;
            }
            {
                short data = dataCopy;
    
                {
                    /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                    IO.writeLine((byte)data);
                }
    
            }
        }
};