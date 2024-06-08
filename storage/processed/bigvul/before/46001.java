class bad_class{
    public void bad() throws Throwable
        {
            short data = badSource();
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};