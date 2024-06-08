class bad_class{
    public void bad() throws Throwable
        {
            if (privateReturnsTrue())
            {
                int x, y;
                x = (new SecureRandom()).nextInt(3);
                y = 0;
                /* FLAW: Suspicious semicolon before the if statement brace */
                if (x == 0);
                {
                    IO.writeLine("x == 0");
                    y = 1; /* do something other than just printing in block */
                }
                IO.writeLine(y);
            }
        }
};