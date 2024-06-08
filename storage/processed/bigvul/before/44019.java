class bad_class{
    public void bad() throws Throwable
        {
            int data;
    
            /* FLAW: Use a number larger than Short.MAX_VALUE */
            data = Short.MAX_VALUE + 5;
    
            for (int i = 0; i < 1; i++)
            {
                {
                    /* POTENTIAL FLAW: Convert data to a short, possibly causing a truncation error */
                    IO.writeLine((short)data);
                }
            }
        }
};