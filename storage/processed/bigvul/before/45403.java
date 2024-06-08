class bad_class{
    public void bad() throws Throwable
        {
            short data;
    
            badPublicStatic = true;
            data = (new CWE197_Numeric_Truncation_Error__short_Environment_22b()).badSource();
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};