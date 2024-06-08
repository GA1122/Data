class good1_class{
    private void good1() throws Throwable
        {
            switch (8)
            {
            case 7:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            default:
                /* FIX: don't have those types of comments :) */
                IO.writeLine("This a test of the emergency broadcast system");
                break;
            }
        }
};