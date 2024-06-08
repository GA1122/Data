class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            while (true)
            {
                /* FLAW: Use a number larger than Byte.MAX_VALUE */
                data = Byte.MAX_VALUE + 5;
                break;
            }
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};