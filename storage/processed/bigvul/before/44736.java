class badSink_class{
    public void badSink(CWE197_Numeric_Truncation_Error__int_random_to_byte_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};