class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrueOrFalse())
            {
                int intOne = 1;
                IO.writeLine(intOne);
                /* FLAW: The statement below has no effect since it is setting a variable to itself */
                intOne = intOne;
                IO.writeLine(intOne);
            }
            else
            {
    
                int intOne = 1, intFive = 5;
    
                IO.writeLine(intOne);
    
                /* FIX: Assign intFive to intOne */
                intOne = intFive;
    
                IO.writeLine(intOne);
    
            }
        }
};