class bad_class{
    public void bad() throws Throwable
        {
            short dataCopy;
            {
                short data;
    
                /* FLAW: Set data to a random value */
                data = (short)((new SecureRandom()).nextInt(Short.MAX_VALUE + 1));
    
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