class good1_class{
    private void good1() throws Throwable
        {
            for(int k = 0; k < 1; k++)
            {
                int x, y;
                x = (new SecureRandom()).nextInt(3);
                y = 0;
                /* FIX: Remove the suspicious semicolon before the if statement brace */
                if (x == 0)
                {
                    IO.writeLine("x == 0");
                    y = 1; /* do something other than just printing in block */
                }
                IO.writeLine(y);
            }
        }
};