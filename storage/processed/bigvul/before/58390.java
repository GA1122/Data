class good1_class{
    private void good1() throws Throwable
        {
            while(true)
            {
                int intOne = 1, intFive = 5;
                IO.writeLine(intOne);
                /* FIX: Assign intFive to intOne */
                intOne = intFive;
                IO.writeLine(intOne);
                break;
            }
        }
};