class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
                try
                {
                    Integer.parseInt("Test"); /* Will throw NumberFormatException */
                }
                catch (NumberFormatException exceptNumberFormat) /* FIX: Catch NumberFormatException */
                {
                    IO.writeLine("Caught Exception");
                    throw exceptNumberFormat; /* Rethrow */
                }
            }
        }
};