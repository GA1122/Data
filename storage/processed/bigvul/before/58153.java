class good2_class{
    private void good2() throws Throwable
        {
            switch (7)
            {
            case 7:
                int x = (new SecureRandom()).nextInt();
                switch (x)
                {
                    /* FIX: Do not include an empty case statement */
                case 0:
                    IO.writeLine("Inside the case statement");
                    break;
                default:
                    IO.writeLine("Inside the default statement");
                    break;
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