class bad_class{
    public void bad() throws Throwable
        {
            if (IO.STATIC_FINAL_TRUE)
            {
                int x = (new SecureRandom()).nextInt();
                switch (x)
                {
                    /* FLAW: An empty case statement has no effect */
                case 0:
                    break;
                default:
                    IO.writeLine("Inside the default statement");
                    break;
                }
                IO.writeLine("Hello from bad()");
            }
        }
};