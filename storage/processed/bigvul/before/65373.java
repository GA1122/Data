class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                {
                    String myString = null;
                    myString = "Hello";
                    IO.writeLine(myString.length());
                    /* FLAW: Check for null after dereferencing the object. This null check is unnecessary. */
                    if (myString != null)
                    {
                        myString = "my, how I've changed";
                    }
                    IO.writeLine(myString.length());
                }
            }
            else
            {
    
                {
                    String myString = null;
                    myString = "Hello";
    
                    IO.writeLine(myString.length());
    
                    /* FIX: Don't check for null since we wouldn't reach this line if the object was null */
                    myString = "my, how I've changed";
    
                    IO.writeLine(myString.length());
                }
    
            }
        }
};