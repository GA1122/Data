class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                int x;
                x = (new SecureRandom()).nextInt();
                /* FIX: Do not include an empty if statement */
                if (x == 0)
                {
                    IO.writeLine("Inside the if statement");
                }
                else
                {
                    IO.writeLine("Inside the else statement");
                }
                IO.writeLine("Hello from good()");
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};