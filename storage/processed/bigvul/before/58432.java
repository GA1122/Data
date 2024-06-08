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
                /* FIX: Do not include semicolon (statement that has no effect) */
                IO.writeLine("Hello from good()");
                break;
            }
        }
};