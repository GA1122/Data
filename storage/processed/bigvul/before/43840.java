class badSink_class{
    private void badSink() throws Throwable
        {
            int data = dataBad;
    
            {
                /* POTENTIAL FLAW: Convert data to a short, possibly causing a truncation error */
                IO.writeLine((short)data);
            }
    
        }
};