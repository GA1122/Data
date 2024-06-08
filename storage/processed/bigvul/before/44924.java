class goodG2BSink_class{
    public void goodG2BSink(int dataArray[] ) throws Throwable
        {
            int data = dataArray[2];
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};