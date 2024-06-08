class goodG2BSink_class{
    public void goodG2BSink() throws Throwable
        {
            int data = CWE197_Numeric_Truncation_Error__int_random_to_short_68a.data;
    
            {
                /* POTENTIAL FLAW: Convert data to a short, possibly causing a truncation error */
                IO.writeLine((short)data);
            }
    
        }
};