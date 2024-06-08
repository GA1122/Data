class bad_class{
    public void bad() throws Throwable
        {
            while(true)
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
                break;
            }
        }
};