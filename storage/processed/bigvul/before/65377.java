class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
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