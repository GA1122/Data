class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            while (true)
            {
                /* FLAW: Use a number larger than Short.MAX_VALUE */
                data = Short.MAX_VALUE + 5;
                break;
            }
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};