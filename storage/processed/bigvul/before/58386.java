class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                int intOne = 1;
                IO.writeLine(intOne);
                /* FLAW: The statement below has no effect since it is setting a variable to itself */
                intOne = intOne;
                IO.writeLine(intOne);
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};