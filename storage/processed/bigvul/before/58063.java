class bad_class{
    public void bad() throws Throwable
        {
            for(int j = 0; j < 1; j++)
            {
                try
                {
                    Integer.parseInt("Test"); /* Will throw NumberFormatException */
                }
                catch (Throwable throwable) /* FLAW: Catch Throwable, which is overly generic */
                {
                    IO.writeLine("Caught Throwable");
                    throw throwable; /* Rethrow */
                }
            }
        }
};