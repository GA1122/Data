class bad_class{
    public void bad() throws Throwable
        {
            short data = (new CWE197_Numeric_Truncation_Error__short_Environment_61b()).badSource();
    
            {
                /* POTENTIAL FLAW: Convert data to a byte, possibly causing a truncation error */
                IO.writeLine((byte)data);
            }
    
        }
};