class goodG2B_class{
    private void goodG2B() throws Throwable
        {
            int data = (new CWE197_Numeric_Truncation_Error__int_database_to_byte_61b()).goodG2BSource();
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};