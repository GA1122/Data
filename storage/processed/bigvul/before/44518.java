class goodG2B1_class{
    private void goodG2B1() throws Throwable
        {
            int data;
    
            goodG2B1PublicStatic = false;
            data = (new CWE197_Numeric_Truncation_Error__int_Property_to_byte_22b()).goodG2B1Source();
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};