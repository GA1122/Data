class good1_class{
    private void good1() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_FIVE != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
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