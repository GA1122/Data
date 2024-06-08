class bad_class{
    public void bad() throws Throwable
        {
            int dataCopy;
            {
                int data;
    
                /* FLAW: Use a number larger than Short.MAX_VALUE */
                data = Short.MAX_VALUE + 5;
    
                dataCopy = data;
            }
            {
                int data = dataCopy;
    
                {
                    /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                    IO.writeLine((byte)data);
                }
    
            }
        }
};