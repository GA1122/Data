class bad_class{
    public void bad() throws Throwable
        {
            while(true)
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
                break;
            }
        }
};