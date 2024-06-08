class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                {
                    /* FLAW: Check for null, but still dereference the object */
                    String myString = null;
                    if (myString == null)
                    {
                        IO.writeLine(myString.length());
                    }
                }
            }
            else
            {
    
                {
                    /* FIX: Check for null and do not dereference the object if it is null */
                    String myString = null;
    
                    if (myString == null)
                    {
                        IO.writeLine("The string is null");
                    }
                }
    
            }
        }
};