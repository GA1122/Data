class bad_class{
    public void bad() throws Throwable
        {
            if (IO.staticReturnsTrue())
            {
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
            }
        }
};