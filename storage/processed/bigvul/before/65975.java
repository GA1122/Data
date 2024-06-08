class good2_class{
    private void good2() throws Throwable
        {
            if (IO.staticTrue)
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