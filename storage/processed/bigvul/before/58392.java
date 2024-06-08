class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                int intOne = 1, intFive = 5;
                IO.writeLine(intOne);
                /* FIX: Assign intFive to intOne */
                intOne = intFive;
                IO.writeLine(intOne);
            }
        }
};