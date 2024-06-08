class good1_class{
    private void good1() throws Throwable
        {
            if (IO.STATIC_FINAL_FALSE)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
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