class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
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
        }
};