class good1_class{
    private void good1() throws Throwable
        {
            int x, y;
    
            x = (new SecureRandom()).nextInt(3);
            y = 0;
    
            /* FIX: put the related statements within braces */
            if (x == 0)
            {
                IO.writeLine("x == 0");
                y = 1;
            }
    
            if (y == 1) 
            {
                IO.writeLine("x was 0");
            }
        }
};