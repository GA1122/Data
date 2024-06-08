class goodG2BSink_class{
    public void goodG2BSink(Object dataObject ) throws Throwable
        {
            int data = (Integer)dataObject;
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};