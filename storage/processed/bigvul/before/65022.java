class bad_class{
    public void bad() throws Throwable
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
};