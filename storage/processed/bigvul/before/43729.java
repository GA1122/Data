class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            int data;
    
            goodG2B1_private = false;
            data = goodG2B1_source();
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};