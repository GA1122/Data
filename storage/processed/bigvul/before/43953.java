class goodG2BSink_class{
    public void goodG2BSink() throws Throwable
        {
            int data = CWE197_Numeric_Truncation_Error__int_large_to_byte_68a.data;
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};