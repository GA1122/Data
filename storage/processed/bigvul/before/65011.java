class good2_class{
    private void good2() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE == 5)
            {
                {
                    String myString = null;
                    /* FIX: Use && in the if statement so that if the left side of the expression fails then
                     * the right side will not be evaluated */
                    if ((myString != null) && (myString.length() > 0))
                    {
                        IO.writeLine("The string length is greater than 0");
                    }
                }
            }
        }
};