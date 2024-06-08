class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
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