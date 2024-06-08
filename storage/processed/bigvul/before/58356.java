class good2_class{
    private void good2() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
                int intOne = 1, intFive = 5;
                IO.writeLine(intOne);
                /* FIX: Assign intFive to intOne */
                intOne = intFive;
                IO.writeLine(intOne);
            }
        }
};