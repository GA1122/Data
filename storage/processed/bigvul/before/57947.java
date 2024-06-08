class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
            {
                String systemProperty = System.getProperty("CWE395");
                try
                {
                    /* INCIDENTAL: Possible Null Pointer Dereference (CWE476 / CWE690) */
                    if(systemProperty.equals("CWE395"))
                    {
                        IO.writeLine("systemProperty is CWE395");
                    }
                }
                catch (NullPointerException exceptNullPointer) /* FLAW: Use of catch block to detect null dereferences */
                {
                    IO.writeLine("systemProperty is null");
                }
            }
        }
};