class bad_class{
    public void bad() throws Throwable
        {
            switch (7)
            {
            case 7:
                int x;
                x = (new SecureRandom()).nextInt();
                /* FLAW: An empty if statement has no effect */
                if (x == 0)
                {
                }
                else
                {
                    IO.writeLine("Inside the else statement");
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