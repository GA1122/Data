class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                int x;
                x = (new SecureRandom()).nextInt();
                if (x == 0)
                {
                    IO.writeLine("Inside the else statement");
                }
                /* FLAW: An empty else statement has no effect */
                else
                {
                }
                IO.writeLine("Hello from bad()");
                break;
            default:
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
                break;
            }
        }
};