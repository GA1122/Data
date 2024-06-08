class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                try
                {
                    Integer.parseInt("Test"); /* Will throw NumberFormatException */
                }
                catch (Exception exception) /* FLAW: Catch Exception, which is overly generic */
                {
                    IO.writeLine("Caught Exception");
                    throw exception; /* Rethrow */
                }
            }
        }
};