class goodG2BSink_class{
    public void goodG2BSink(CWE197_Numeric_Truncation_Error__int_PropertiesFile_to_byte_67a.Container dataContainer ) throws Throwable
        {
            int data = dataContainer.containerOne;
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};