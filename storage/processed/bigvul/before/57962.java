class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticFive != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
            {
    
                String systemProperty = System.getProperty("CWE395");
    
                if (systemProperty != null) /* FIX: Check for null before calling equals() */
                {
                    if (systemProperty.equals("CWE395"))
                    {
                        IO.writeLine("systemProperty is CWE395");
                    }
                }
                else
                {
                    IO.writeLine("systemProperty is null");
                }
    
            }
        }
};