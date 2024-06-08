class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE == 5)
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