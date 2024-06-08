class good1_class{
    private void good1() throws Throwable
        {
            while(true)
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
                break;
            }
        }
};