class goodG2B2_class{
    private void goodG2B2() throws Throwable
        {
            short data;
    
            goodG2B2PublicStatic = true;
            data = (new CWE197_Numeric_Truncation_Error__short_listen_tcp_22b()).goodG2B2Source();
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};