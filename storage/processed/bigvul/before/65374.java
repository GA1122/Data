class good1_class{
    private void good1() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
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