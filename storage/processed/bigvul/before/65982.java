class good1_class{
    private void good1() throws Throwable
        {
            if (IO.STATIC_FINAL_FIVE != 5)
            {
                /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
                IO.writeLine("Benign, fixed string");
            }
            else
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