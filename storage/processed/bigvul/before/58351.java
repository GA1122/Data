class bad_class{
    public void bad() throws Throwable
        {
            if (5 == 5)
            {
                int intOne = 1;
                IO.writeLine(intOne);
                /* FLAW: The statement below has no effect since it is setting a variable to itself */
                intOne = intOne;
                IO.writeLine(intOne);
            }
        }
};