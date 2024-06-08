class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            short data;
    
            goodG2B2_private = true;
            data = goodG2B2_source();
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};