class bad_class{
    public void bad() throws Throwable
        {
            if (PRIVATE_STATIC_FINAL_TRUE)
            {
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
            }
        }
};