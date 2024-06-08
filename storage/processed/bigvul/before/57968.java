class good1_class{
    private void good1() throws Throwable
        {
            while(true)
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
                break;
            }
        }
};